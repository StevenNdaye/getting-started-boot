package com.jug.boot.controller;


import com.jug.boot.entity.Employee;
import com.jug.boot.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepo employeeRepo;

    @RequestMapping(method = RequestMethod.GET, value = "/employees")
    public List<Employee> getAll(){
        return (List<Employee>) employeeRepo.findAll();
    }
}
