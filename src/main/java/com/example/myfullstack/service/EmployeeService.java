package com.example.myfullstack.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.myfullstack.entity.Employee;
import com.example.myfullstack.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	private final EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public List<Employee> getAll() {
        return repository.findAll();
    }

    public Employee save(Employee employee) {
        return repository.save(employee);
    }

}
