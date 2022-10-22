package com.example.EmployeeDetailsController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmployeeDetailsModel.EmployeeModel;
import com.example.EmployeeDetailsService.EmployeeInterface;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeInterface employeeInterface;
	
	@GetMapping(path="/GetEmployees")
	public List<EmployeeModel> GetEmployeeDetails() {
		
		return employeeInterface.fetchEmployeeList();
		
	}
	
	@PostMapping(path="/CreateEmployee")
	public String CreateEmployee( EmployeeModel employeeModel) {
		String result="";
		if(employeeModel!=null ) {
			result = employeeInterface.saveEmployee(employeeModel);
		 
		}
		return result;
	}

}
