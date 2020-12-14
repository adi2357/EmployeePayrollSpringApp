package com.bridgelabz.employeepayrollapp.dto;

import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

import lombok.Data;

public @Data class EmployeePayrollDTO { 
	
	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}([ ][A-Z]{1}[a-zA-Z\\s]{2,})?$",
			message = "Employee name is Invalid")
	public String name;
	@Min(value = 30000, message = "Salary should be more than Rs. 30,000")
	@Max(value = 80000, message = "Salary should be less than Rs. 80,000")
	public long salary;
	public String profilePicture;
	public String[] departments;
	public Date startDate;
	public String notes;
	public String gender;

	

	public EmployeePayrollDTO(String name, long salary, String profilePicture, String[] departments, Date startDate, String notes, String gender) {
		this.name = name;
		this.salary = salary;
		this.profilePicture = profilePicture;
		this.departments = departments;
		this.startDate = startDate;
		this.notes = notes;
		this.gender = gender;
	}
}