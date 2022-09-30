package com.rifqimuhammadaziz.employeemanagement.service;

import com.rifqimuhammadaziz.employeemanagement.entity.EmployeeEntity;
import com.rifqimuhammadaziz.employeemanagement.model.Employee;
import com.rifqimuhammadaziz.employeemanagement.repository.EmployeeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee createEmployee(Employee employee) {
        EmployeeEntity employeeEntity = new EmployeeEntity();
        BeanUtils.copyProperties(employee, employeeEntity);
        employeeRepository.save(employeeEntity);

        return employee;
    }
}
