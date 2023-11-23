package com.ManagementSystem.Employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ManagementSystem.Employee.model.employee;

public interface empRepo extends JpaRepository<employee,Integer> {

    
}
