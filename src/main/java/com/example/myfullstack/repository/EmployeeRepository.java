package com.example.myfullstack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.myfullstack.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
