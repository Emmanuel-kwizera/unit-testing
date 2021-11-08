package com.example.catpreparation.service;

import com.example.catpreparation.model.Employee;
import com.example.catpreparation.repository.EmployeeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeServiceTest {

    @Mock
    private EmployeeRepository employeeRepository;

    @InjectMocks
    private EmployeeService employeeService;

    @Test
    public void getAll_returnExistingElements(){
        when(employeeRepository.findAll()).thenReturn(Arrays.asList(new Employee(1L,"Samuel",10,4500),new Employee(2L,"Isac",15,45000),new Employee(3L,"Sauve",10,5500)));

        float expectedValue = 10 * 450;
        assertEquals(expectedValue,employeeService.getAll().get(0).getMonthly_salary());
    }

}
