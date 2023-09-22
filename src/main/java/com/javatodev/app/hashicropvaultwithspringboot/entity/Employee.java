package com.javatodev.app.hashicropvaultwithspringboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue
    private int id;
    @Column(name="emp_name")
    private String name;
    @Column(name="emp_salary")
    private float Salary;

}
