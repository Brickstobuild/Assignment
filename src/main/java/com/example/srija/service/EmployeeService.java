package com.example.srija.service;

import com.example.srija.model.Employee;
import com.example.srija.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository repo;

    public List <Employee> getAllEmployees()
    {
        return repo.findAll();  //select * from employee;
    }


    public Employee getEmployeeByEmpno(int empno)
    {
        return repo.findById(empno).get();   //select * from table where empno= "value";
    }




    //Method for inserting values into db table using "Save"
    public  void addEmployee( Employee employee) {

        repo.save(employee);

    }

    public List<Employee> getByDepartment(String dept)
    {
        return repo.findByempdepartment(dept);

    }


    public List<Employee> getByDesignation(String designation)
    {
        return repo.findByempdesignation(designation);

    }

    public void deleteEmployee(int empno){

        repo.deleteById(empno);
    }


}
