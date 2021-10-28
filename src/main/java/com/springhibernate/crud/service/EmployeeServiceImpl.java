package com.springhibernate.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springhibernate.crud.entity.Employee;
import com.springhibernate.crud.repository.EmployeeCrudRepo;

@Service
public class EmployeeServiceImpl implements EmployeeServiceInterface {

	
	@Autowired
	private EmployeeCrudRepo employeeCrudRepo;

	@Override
	public Employee addEmployee(Employee employee) {
		Employee savedEmployee = employeeCrudRepo.save(employee);
		return savedEmployee;	
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeCrudRepo.findAll();
	}

	@Override
	public Employee getEmployeeById(long empidL) {
		return employeeCrudRepo.findById(empidL).get();
}

	@Override
	public void deleteEmployeeById(Long empidL) {
		employeeCrudRepo.deleteById(empidL);
		
	}

}