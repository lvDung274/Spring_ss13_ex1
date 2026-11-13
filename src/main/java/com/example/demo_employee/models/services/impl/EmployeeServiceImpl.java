package com.example.demo_employee.models.services.impl;

import com.example.demo_employee.models.entities.Employee;
import com.example.demo_employee.models.repositories.EmployeeRepository;
import com.example.demo_employee.models.services.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }
}
