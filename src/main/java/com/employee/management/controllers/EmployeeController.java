package com.employee.management.controllers;

import com.employee.management.dto.EmployeeDto;
import com.employee.management.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employees")
@Slf4j
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public ResponseEntity<List<EmployeeDto>> getEmployees(@RequestParam(name = "size", required = false, defaultValue = "5") Integer size,
                                                          @RequestParam(name = "pageNo", required = false, defaultValue = "1") Integer pageNo,
                                                          @RequestParam(name = "sortDir", required = false, defaultValue = "ASC")Sort.Direction direction) {
        log.info("param {} {}", size, pageNo);
        return ResponseEntity.ok().body(employeeService.getAllEmployees(PageRequest.of(pageNo, size, Sort.by(direction, "id"))));
    }

    @PostMapping
    public ResponseEntity<String> createEmployee(@RequestBody EmployeeDto employeeDto) {
        if(employeeService.createEmployee(employeeDto)) {
            return ResponseEntity.status(HttpStatus.CREATED).body("Employee Created Successfully");
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error Occurred");
        }
    }

    @PutMapping("/")
    public ResponseEntity<String> updateEmployee(@RequestBody EmployeeDto employeeDto) {
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable("id") String id) {
        return null;
    }



}

/*

    client ( browser )     ---------->       PUT /employee


    client ( browser )     -------------->   GET /login
                            user and pass
                           <--------------
                        JWT (employeeId, roles)

   client ( browser )   --------------------> PUT /employee
                            JWT


 */
