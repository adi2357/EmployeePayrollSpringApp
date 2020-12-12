package com.bridgelabz.employeepayrollapp.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
//@Table(name = "DEPARTMENT")
public @Data class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int departmentId;
	@Column(name = "department_name")
	private String departmentName;
	

	public Department() {
	}

	public Department(String departmentName) {
		this.setDepartmentName(departmentName);
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
}
