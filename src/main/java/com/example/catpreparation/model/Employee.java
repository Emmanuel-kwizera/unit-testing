package com.example.catpreparation.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;

@Data
@NoArgsConstructor
public class Employee {
    @Id
    private Long id;
    private String names;
    private int working_days;
    private float daily_salary;
    @Transient
    private float monthly_salary;

    public Employee(Long id, String names, int working_days, float daily_salary) {
        this.id = id;
        this.names = names;
        this.working_days = working_days;
        this.daily_salary = daily_salary;
    }
}
