package com.example.tarea2_20212591_20212474.controller;

import com.example.tarea2_20212591_20212474.repository.DepartmentRepository;
import com.example.tarea2_20212591_20212474.repository.EmployeeRepository;
import org.springframework.stereotype.Controller;

@Controller
public class DepartmentController {
    final DepartmentRepository departmentRepository;

    public DepartmentController(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

}
