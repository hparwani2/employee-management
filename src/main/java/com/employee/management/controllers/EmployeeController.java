package com.employee.management.controllers;

import com.employee.management.dto.EmployeeDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/employees")
public class EmployeeController {

    @GetMapping("/")
    public ResponseEntity<List<EmployeeDto>> getEmployees() {

    }

    @PostMapping("/")
    public ResponseEntity<String> createEmployee(@RequestBody EmployeeDto employeeDto) {

    }

    @PutMapping("/")
    public ResponseEntity<String> createEmployee(@RequestBody EmployeeDto employeeDto) {

    }



}
