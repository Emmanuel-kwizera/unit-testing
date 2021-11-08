package com.example.catpreparation.service;

import com.example.catpreparation.model.Employee;
import com.example.catpreparation.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAll() {
        List<Employee> employees = employeeRepository.findAll();

        for (Employee item : employees) {
            item.setMonthly_salary(item.getWorking_days() * item.getDaily_salary());
        }
        return employees;
    }
}
