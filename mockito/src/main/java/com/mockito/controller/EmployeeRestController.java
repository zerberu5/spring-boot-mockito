package com.mockito.controller;

import com.mockito.entity.Employee;
import com.mockito.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee")
    public Employee getAllEmployees() {
        return employeeService.getEmployeeByName("dulli");
    }
}
