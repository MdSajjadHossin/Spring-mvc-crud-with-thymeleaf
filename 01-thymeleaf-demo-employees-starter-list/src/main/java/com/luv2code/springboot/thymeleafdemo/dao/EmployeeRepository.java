package com.luv2code.springboot.thymeleafdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luv2code.springboot.thymeleafdemo.entity.Employee;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	// by using spring data JpaRepository there is no need for making any function

    // add method to sort by last Name
    public List<Employee> findAllByOrderByLastNameAsc();
	
}
