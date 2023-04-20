package com.emerson.example.demo.service;

import com.emerson.example.demo.model.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();
    public Employee createEmployee(Employee employee);
}
