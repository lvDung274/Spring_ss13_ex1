package com.example.demo_employee.models.services;

import com.example.demo_employee.models.entities.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
}
