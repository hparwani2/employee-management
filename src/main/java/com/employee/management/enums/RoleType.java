package com.employee.management.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum RoleType {

    ADMIN("admin"),
    EMPLOYEE("employee");

    private String role;
}
