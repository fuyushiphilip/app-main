package com.javawhizz.App.service;


import com.javawhizz.App.model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee addEmployee(Employee employee);
    List<Employee> getAllEmployee();
    Employee getEmployee(long id);
    Employee updateEmployee(long id, Employee employee);
    void deleteEmployee(long id);
}
