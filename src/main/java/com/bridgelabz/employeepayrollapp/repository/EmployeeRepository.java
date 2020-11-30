package com.bridgelabz.employeepayrollapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;

public interface EmployeeRepository extends CrudRepository<EmployeePayrollData, Integer>{
	
}
