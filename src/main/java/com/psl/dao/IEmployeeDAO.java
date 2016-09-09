package com.psl.dao;

import java.util.List;

import com.psl.entity.Employee;

public interface IEmployeeDAO {
	List<Employee> getAllEmployee();
	void addEmployee(Employee e);
}
