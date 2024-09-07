package com.example.tarea2_20212591_20212474.controller;

import com.example.tarea2_20212591_20212474.repository.JobRepository;
import org.springframework.stereotype.Controller;

@Controller
public class JobController {
    final JobRepository jobRepository;

    public JobController(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }
}
