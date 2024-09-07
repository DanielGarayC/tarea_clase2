package com.example.tarea2_20212591_20212474.controller;

import com.example.tarea2_20212591_20212474.entity.Employee;
import com.example.tarea2_20212591_20212474.entity.Job;
import com.example.tarea2_20212591_20212474.repository.EmployeeRepository;
import com.example.tarea2_20212591_20212474.repository.JobRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class EmployeeController {
    final EmployeeRepository employeeRepository;
    final JobRepository jobRepository;
    public EmployeeController(EmployeeRepository employeeRepository, JobRepository jobRepository) {
        this.employeeRepository = employeeRepository;
        this.jobRepository = jobRepository;
    }

    @GetMapping({"employee/list", "employee"})
    public String listarEmpleados(Model model) {
        List<Employee> lista = employeeRepository.findAll();
        model.addAttribute("employeeList", lista);
        return "listaEmpleados";
    }
    @GetMapping("employee/info/{id}")
    public String informEmpleado(@PathVariable("id") Integer employeeId, Model model) {
        Optional<Employee> optEmployee = employeeRepository.findById(employeeId);
        if(optEmployee.isPresent()){
            Employee employee = optEmployee.get();
            model.addAttribute("employee",employee);
            model.addAttribute("selectedJobId", employee.getJob().getJob_id());

        }
        List<Job> jobs = jobRepository.findAll();
        model.addAttribute("jobs",jobs);
        return "infoEmpleado";
    }
    @GetMapping("/delete")
    public String borrarEmpleado(Model model, @RequestParam("id") int id) {

        Optional<Employee> optEmployee = employeeRepository.findById(id);

        if (optEmployee.isPresent()) {
            try {
                employeeRepository.deleteById(id);
                model.addAttribute("exito", "Se borró el empleado");

            } catch (Exception e) {
                model.addAttribute("error", "No se puede borrar el empleado");
                return "redirect:/employee/list";
            }
        } else {
            model.addAttribute("error", "Empleado no encontrado.");
        }
        return "redirect:/employee/list";
    }

}
