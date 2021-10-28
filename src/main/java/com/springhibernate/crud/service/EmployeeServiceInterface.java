package com.springhibernate.crud.service;

import java.util.List;

import com.springhibernate.crud.entity.Employee;

public interface EmployeeServiceInterface {

	public Employee addEmployee(Employee employee);

	public List<Employee> getAllEmployees();

	public Employee getEmployeeById(long empidL);

	public void deleteEmployeeById(Long empidL);

	

	
	
	
}
