package com.bridgelabz.employeepayrollapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;

@Repository
public interface EmployeeRepository extends CrudRepository<EmployeePayrollData, Integer>{

	@Query(value = "select * from employee, employee_department where employee.id = employee_department.id and employee_department.departments = :department", nativeQuery = true)
	List<EmployeePayrollData> findEmployeesByDepartment(String department);
	
}
