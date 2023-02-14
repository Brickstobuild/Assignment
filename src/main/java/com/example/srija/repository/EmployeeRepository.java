package com.example.srija.repository;

import com.example.srija.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
//employee is the class and integer is data type of primary key of table emp.
//
public interface EmployeeRepository extends JpaRepository<Employee,Integer>

{
    public List<Employee> findByempdepartment(String name);
    public List<Employee> findByempdesignation(String name);

    }
