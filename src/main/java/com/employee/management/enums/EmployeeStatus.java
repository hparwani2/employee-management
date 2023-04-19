package com.employee.management.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EmployeeStatus {
    ACTIVE("active"),
    INACTIVE("in-active");

    private String status;
}
