package com.example.employeemanagement.service;


import com.example.employeemanagement.dto.EmployeeDto;
import com.example.employeemanagement.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<EmployeeDto> findAllEmployees();

    Employee createEmployee(EmployeeDto employee);

    Employee updateEmployee(EmployeeDto employee);

    Employee findEmployeeById(Long id);

    void deleteEmployeeById(Long id);
}
