package com.bridgelabz.employeepayrollapp.dto;

import java.time.LocalDate;
import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
public @ToString class EmployeePayrollDTO { 
	
	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}([ ][A-Z]{1}[a-zA-Z\\s]{2,})?$",
			message = "Employee name is Invalid")
	public String name;
	
	@Min(value = 30000, message = "Salary should be more than Rs. 30,000")
	@Max(value = 50000, message = "Salary should be less than Rs. 50,000")
	public long salary;
	
	@NotBlank(message = "Profile picture cannot be Blank")
	public String profilePicture;
	
	@NotEmpty(message = "Department List cannot be Empty")
	public List<String> departments;
	
	@JsonFormat(pattern = "dd MMM yyyy")
	@NotNull(message = "Start Date cannot be Empty")
	@PastOrPresent(message = "Start Date  cannot be a Future Date")
	public LocalDate startDate;
	
	@Pattern(regexp = "male|female", message = "Gender needs to be either male or female")
	public String gender;
	
	public String notes;
}