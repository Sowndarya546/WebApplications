package com.example.EmployeeDetailsModel;

import java.util.Date;

public class EmployeeModel {
	private int employee_ID;

	private String firstName;

	private String lastName;

	private String email;

	private String phoneNumber;

	private String DOJ;

	private int Salary;
	
	private int yearlySalary;
	
	public int getYearlySalary() {
		return yearlySalary;
	}

	public void setYearlySalary(int yearlySalary) {
		this.yearlySalary = yearlySalary;
	}

	private int tax_amount;

	public int getTax_amount() {
		return tax_amount;
	}

	public void setTax_amount(int tax_amount) {
		this.tax_amount = tax_amount;
	}

	public EmployeeModel() {
		super();
	}

	public int getEmployee_ID() {
		return employee_ID;
	}

	public void setEmployee_ID(int employee_ID) {
		this.employee_ID = employee_ID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getDOJ() {
		return DOJ;
	}

	public void setDOJ(String dOJ) {
		DOJ = dOJ;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}
	
	

}
