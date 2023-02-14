package com.example.srija.controller;



import com.example.srija.model.Employee;
import com.example.srija.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/employee")

public class EmployeeController {

    @Autowired
    EmployeeService service;  //dependency injection

    @GetMapping ("/all")
    public List <Employee> getAllEmployees()
    {

        return service.getAllEmployees();
    }


    @GetMapping ("/no/{empno}")
    public Employee getEmployeeByEmpno(@PathVariable("empno") int enumber)
    {
        return service.getEmployeeByEmpno(enumber);
    }


    // Insert the valiues into database table
    @PostMapping("/add")

    public  void addEmployee(@RequestBody Employee employee) {

        service.addEmployee(employee);
    }

    @GetMapping("/getbydepartment/{dept}")

    public  List<Employee> getByDepartment(@PathVariable("dept") String dept)    {

        return service.getByDepartment(dept);

    }


    @GetMapping("/getbydesignation/{designation}")

    public  List<Employee> getByDesignation(@PathVariable("designation") String designation)    {

        return service.getByDesignation(designation);

    }

    @DeleteMapping("/delete/{empno}")

    public  void deleteEmployee(@PathVariable("empno") int empno)
    {

        service.deleteEmployee(empno);

    }





    }
