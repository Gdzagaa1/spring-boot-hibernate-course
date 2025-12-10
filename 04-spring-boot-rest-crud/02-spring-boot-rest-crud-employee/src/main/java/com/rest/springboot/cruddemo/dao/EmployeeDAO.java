package com.rest.springboot.cruddemo.dao;

import com.rest.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
}
