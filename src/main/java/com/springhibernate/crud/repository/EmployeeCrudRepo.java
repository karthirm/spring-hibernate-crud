package com.springhibernate.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springhibernate.crud.entity.Employee;

@Repository
public interface EmployeeCrudRepo extends JpaRepository<Employee, Long> {

}
