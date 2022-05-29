package com.mockito.service;

import com.mockito.entity.Employee;
import com.mockito.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee getEmployeeByName(String name) {
        return employeeRepository.findByName(name);
    }
}
