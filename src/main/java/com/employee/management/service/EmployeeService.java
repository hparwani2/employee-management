package com.employee.management.service;

import com.employee.management.mapper.EmployeeMapper;
import com.employee.management.dto.EmployeeDto;
import com.employee.management.model.EmployeeEntity;
import com.employee.management.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private EmployeeMapper employeeMapper;

    public List<EmployeeDto> getAllEmployees(Pageable pageable) {
        Page<EmployeeEntity> employeeEntities = employeeRepository.findAll(pageable);

        return employeeMapper.employeeEntityListToDtoList(employeeEntities.getContent());
    }

    public boolean createEmployee(EmployeeDto employeeDto) {
        try {
            EmployeeEntity employeeEntity = employeeRepository.save(employeeMapper.employeeDtoToEntity(employeeDto));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
