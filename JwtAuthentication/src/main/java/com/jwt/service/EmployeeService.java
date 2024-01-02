package com.jwt.service;

import org.springframework.stereotype.Service;

import com.jwt.model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {

    private List<Employee> empList = new ArrayList<>();

    public EmployeeService() {
        empList.add(new Employee(UUID.randomUUID().toString(), "Abhishek", "abhiabhishek9347@gmail.com"));
        empList.add(new Employee(UUID.randomUUID().toString(), "Ayub", "ayub97@gmail.com"));
    }

    public List<Employee> getEmployeesList() {
        return empList;
    }
}
