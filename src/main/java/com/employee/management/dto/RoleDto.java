package com.employee.management.dto;

import com.employee.management.enums.RoleType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RoleDto {
    private Integer id;

    private RoleType roleName;
}
