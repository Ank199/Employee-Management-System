package com.ManagementSystem.Employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ManagementSystem.Employee.model.employee;
import com.ManagementSystem.Employee.repository.empRepo;

@Service
public class empServiceImpl implements empService {

@Autowired
empRepo service;
    
    @Override
    public List<employee> getAllEmp() {
        return service.findAll();
    }

    @Override
    public String AddEmp(employee emp) {
        service.save(emp);
        return "employee added successfully";
    }

    @Override
    public String deleteEmp(Integer Id) {
        service.deleteById(Id);
        return "deleted";
    }
  
    
}
