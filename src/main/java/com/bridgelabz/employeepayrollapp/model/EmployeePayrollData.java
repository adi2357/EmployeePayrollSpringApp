package com.bridgelabz.employeepayrollapp.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;

import lombok.Data;

@Entity
@Table(name = "EMPLOYEE")
public @Data class EmployeePayrollData {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String name;
	
	@Column
	private long salary;
	
	@Column
	private String profilePicture;
	
	@Column(name = "start_date")
	private LocalDate startDate;
	
	@Column
	private String notes;
	
	@Column
	private String gender;
	
	@ElementCollection
	@CollectionTable(name = "employee_department", joinColumns = @JoinColumn(name = "id"))
	@Column(name = "departments")
	private List<String> departments;

	public EmployeePayrollData() {
	}

	public EmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
		this.name = employeePayrollDTO.name;
		this.salary = employeePayrollDTO.salary;
		this.profilePicture = employeePayrollDTO.profilePicture;		
		this.departments = employeePayrollDTO.departments;
		this.startDate = employeePayrollDTO.startDate;
		this.notes = employeePayrollDTO.notes;
		this.gender = employeePayrollDTO.gender;
	}
}
