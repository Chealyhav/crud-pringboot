package com.example.employeemanagement.service.impl;

import com.example.employeemanagement.dto.EmployeeDto;
import com.example.employeemanagement.entity.Employee;
import com.example.employeemanagement.repository.EmployeeRepository;
import com.example.employeemanagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<EmployeeDto> findAllEmployees() {
        List<Employee> employees = employeeRepository.findAll();
        return employees.stream().map(this::convertEntityToDto).collect(Collectors.toList());
    }

    @Override
    public Employee createEmployee(EmployeeDto employeeDto) {
        Employee employee = convertDtoToEntity(employeeDto);
        return employeeRepository.save(employee);
    }

    @Override
    public Employee updateEmployee(EmployeeDto employeeDto) {
        Optional<Employee> optionalEmployee = employeeRepository.findById(employeeDto.getId());
        if (optionalEmployee.isPresent()) {
            Employee employee = convertDtoToEntity(employeeDto);
            return employeeRepository.save(employee);
        } else {
            throw new RuntimeException("Employee not found with id: " + employeeDto.getId());
        }
    }

    @Override
    public Employee findEmployeeById(Long id) {
        return employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Employee not found with id: " + id));
    }

    @Override
    public void deleteEmployeeById(Long id) {
        employeeRepository.deleteById(id);
    }

    private EmployeeDto convertEntityToDto(Employee employee) {
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setId(employee.getId());
        employeeDto.setName(employee.getName());
        employeeDto.setDob(employee.getDob());
        employeeDto.setGender(employee.getGender());
        employeeDto.setEmail(employee.getEmail());
        employeeDto.setCreatedOn(employee.getCreatedOn());
        employeeDto.setUpdatedOn(employee.getUpdatedOn());
        return employeeDto;
    }

    private Employee convertDtoToEntity(EmployeeDto employeeDto) {
        Employee employee = new Employee();
        employee.setId(employeeDto.getId());
        employee.setName(employeeDto.getName());
        employee.setDob(employeeDto.getDob());
        employee.setGender(employeeDto.getGender());
        employee.setEmail(employeeDto.getEmail());
        return employee;
    }
}
