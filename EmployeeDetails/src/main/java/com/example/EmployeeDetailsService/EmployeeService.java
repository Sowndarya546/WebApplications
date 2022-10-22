package com.example.EmployeeDetailsService;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.EmployeeDetailsModel.EmployeeModel;
import com.example.EmployeeDetailsRepository.EmployeeRepository;

public class EmployeeService implements EmployeeInterface {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public String saveEmployee(EmployeeModel employee) {
		String result = "";
		if(employee.getEmployee_ID()>0 && !employee.getFirstName().isEmpty() && 
				!employee.getLastName().isEmpty() && employee.getDOJ()!=null && 
				!employee.getPhoneNumber().isEmpty() && employee.getSalary()>0) {
			
			employeeRepository.save(employee);
			result = "created successfully";
		}
		else {
			result="some feilds are missing";
		}
		return result;
	}

	@Override
	public List<EmployeeModel> fetchEmployeeList() {
		List<EmployeeModel> employees= (List<EmployeeModel>) employeeRepository.findAll();
		List<EmployeeModel> employeesList= new ArrayList<>();
		int tax_percent=0;
		
		for (EmployeeModel employee : employees) {
			if(employee.getSalary() <= 250000) {
				
				employee.setTax_amount(tax_percent);
			}else if(employee.getSalary() > 250000 && employee.getSalary() <= 500000 ){
				tax_percent = 5*(employee.getSalary()/100);
				employee.setTax_amount(tax_percent);
			}
			else if(employee.getSalary() >500000 && employee.getSalary() <=1000000 ) {
				tax_percent = 10*(employee.getSalary()/100);
				
				employee.setTax_amount(tax_percent);
			}else if(employee.getSalary() >1000000 ) {
				tax_percent = 20*(employee.getSalary()/100);
				
				employee.setTax_amount(tax_percent);
			}
			LocalDate doj = LocalDate.parse(employee.getDOJ()).withDayOfMonth(1); 
			LocalDate today = LocalDate.now(); 
			Period age = Period.between(doj, today); 
			int months = age.getMonths();
			employee.setYearlySalary(Integer.parseInt(employee.getDOJ())*months);
			employeesList.add(employee);
			
		}
		return employeesList;
	}

}