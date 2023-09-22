package com.javatodev.app.hashicropvaultwithspringboot.service;

import com.javatodev.app.hashicropvaultwithspringboot.entity.Employee;
import com.javatodev.app.hashicropvaultwithspringboot.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmpRepository empRepository;

    public Employee saveEmployee(Employee employee) {
        return empRepository.save(employee);
    }

    public List<Employee> saveEmployees(List<Employee> employees) {
        return empRepository.saveAll(employees);
    }

    public List<Employee> getEmployees() {
        return empRepository.findAll();
    }

    public Employee getEmployeeById(int id) {
        return empRepository.findById(id);
    }

    public List<Employee> getEmployeesByName(String name) {
        return empRepository.findByName(name);
    }

    public void deleteEmployeeById(int id) {
         empRepository.deleteById(id);
    }
}
