package com.rest.springboot.cruddemo.service;

import com.rest.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
}
