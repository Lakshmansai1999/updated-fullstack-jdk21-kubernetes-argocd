package com.example.myfullstack.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.myfullstack.entity.Employee;
import com.example.myfullstack.service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
@CrossOrigin("*")
public class EmployeeController {
	
	private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping
    public List<Employee> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Employee save(@RequestBody Employee employee) {
        return service.save(employee);
    }

}
