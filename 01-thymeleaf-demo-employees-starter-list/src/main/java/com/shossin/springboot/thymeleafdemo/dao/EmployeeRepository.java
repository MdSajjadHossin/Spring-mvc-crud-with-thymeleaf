package com.shossin.springboot.thymeleafdemo.dao;

import com.shossin.springboot.thymeleafdemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	// by using spring data JpaRepository there is no need for making any function

    // add method to sort by last Name
    public List<Employee> findAllByOrderByLastNameAsc();
	
}
