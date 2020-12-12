package com.bridgelabz.employeepayrollapp.dto;

import java.util.Date;

import lombok.Data;

public @Data class EmployeePayrollDTO {

	public String name;
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