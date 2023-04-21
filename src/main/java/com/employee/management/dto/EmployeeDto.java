package com.employee.management.dto;

import com.employee.management.enums.EmployeeStatus;
import com.employee.management.model.DepartmentEntity;
import com.employee.management.model.RoleEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeeDto {

    private Integer id;

    private String name;

    private String address;

    private String phoneNo;

    private String position;

    private Float salary;

    private EmployeeStatus status;

    private DepartmentDto department;

    private Set<RoleDto> roles;
}
