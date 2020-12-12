package com.bridgelabz.employeepayrollapp.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;

import lombok.Data;

@Entity
@Table(name = "EMPLOYEE")
public class EmployeePayrollData {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String name;
	@Column
	private long salary;
	@Column
	private String profilePicture;
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Department> departments;
	@Column(name = "start_date")
	private Date startDate;
	@Column
	private String notes;
	@Column
	private String gender;

	public EmployeePayrollData() {
	}

	public EmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
		this.name = employeePayrollDTO.name;
		this.salary = employeePayrollDTO.salary;
		this.profilePicture = employeePayrollDTO.profilePicture;
		List<Department> departments = new ArrayList<Department>();
		for(String department : employeePayrollDTO.departments) {
			departments.add(new Department(department));
		}
		this.departments = departments;
		this.startDate = employeePayrollDTO.startDate;
		this.notes = employeePayrollDTO.notes;
		this.gender = employeePayrollDTO.gender;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public long getSalary() {
		return salary;
	}

	public String getProfilePicture() {
		return profilePicture;
	}

	public String[] getDepartments() {
		String[] departmentArray = new String[departments.size()];
		for (int i = 0; i < departments.size(); i++) {
			departmentArray[i] = departments.get(i).getDepartmentName();
		}
		return departmentArray;
	}

	public Date getStartDate() {
		return startDate;
	}

	public String getNotes() {
		return notes;
	}

	public String getGender() {
		return gender;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}

	public void setDepartments(String[] departments) {
		List<Department> departmentList = new ArrayList<Department>();
		for (String department : departments) {
			departmentList.add(new Department(department));
		}
		this.departments = departmentList;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
