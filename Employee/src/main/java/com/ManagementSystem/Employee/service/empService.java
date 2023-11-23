package com.ManagementSystem.Employee.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ManagementSystem.Employee.model.employee;

@Service
public interface empService {

    public List<employee> getAllEmp();
    public String AddEmp(employee emp);
    public String deleteEmp(Integer Id);
    
}