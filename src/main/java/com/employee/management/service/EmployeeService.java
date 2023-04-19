package com.employee.management.service;

import com.employee.management.EmployeeMapper;
import com.employee.management.dto.EmployeeDto;
import com.employee.management.model.EmployeeEntity;
import com.employee.management.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private EmployeeMapper employeeMapper;

    public List<EmployeeDto> getAllEmployees() {
        List<EmployeeEntity> employeeEntities = employeeRepository.findAll();
        return employeeMapper.employeeEntityListToDtoList(employeeEntities);
    }
}
