package com.example.EmployeeDetailsRepository;

import org.springframework.data.repository.CrudRepository;

import com.example.EmployeeDetailsModel.EmployeeModel;

public interface EmployeeRepository extends CrudRepository<EmployeeModel, Integer> {
	

}
