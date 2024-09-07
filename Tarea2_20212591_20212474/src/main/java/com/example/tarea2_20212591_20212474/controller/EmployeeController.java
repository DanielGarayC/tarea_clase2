package com.example.tarea2_20212591_20212474.controller;

import com.example.tarea2_20212591_20212474.repository.EmployeeRepository;
import com.example.tarea2_20212591_20212474.repository.JobRepository;
import org.springframework.stereotype.Controller;

@Controller
public class EmployeeController {
    final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
}
