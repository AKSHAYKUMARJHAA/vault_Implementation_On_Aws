package com.javatodev.app.hashicropvaultwithspringboot.repository;

import com.javatodev.app.hashicropvaultwithspringboot.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmpRepository extends JpaRepository<Employee, Integer> {

    List <Employee> findByName(String name);
    Employee findById(int id);
}
