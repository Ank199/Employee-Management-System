package com.ManagementSystem.Employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ManagementSystem.Employee.model.employee;
import com.ManagementSystem.Employee.service.empServiceImpl;

@RestController
@RequestMapping("/Emp")
@CrossOrigin(origins = "http://localhost:4200")
public class employeeManagement {

    @Autowired

    private empServiceImpl obj;
    
    @GetMapping("/getAllEmp") // Specify the endpoint URL
    public List<employee> getAllBooks() {
        return obj.getAllEmp();
    }

     @PostMapping("/save")
    public String createBook(@RequestBody employee emp) {
        return obj.AddEmp(emp);
    }

       @DeleteMapping("/delete/{id}")
    public String deleteUserById(@PathVariable("id") Integer Id) {
        System.out.println(Id);
        return obj.deleteEmp(Id);
    }

}
