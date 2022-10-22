package com.example.EmployeeDetailsService;

import java.util.List;

import com.example.EmployeeDetailsModel.EmployeeModel;

public interface EmployeeInterface {
	String saveEmployee(EmployeeModel employee);
	 
    // Read operation
    List<EmployeeModel> fetchEmployeeList();
 

}
