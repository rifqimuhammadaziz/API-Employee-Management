package com.rifqimuhammadaziz.employeemanagement.service;


import com.rifqimuhammadaziz.employeemanagement.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee(Employee employee);

    List<Employee> getAllEmployees();

    boolean deleteEmployee(Long id);
}
