package com.employee.management;

import com.employee.management.dto.EmployeeDto;
import com.employee.management.model.EmployeeEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    @Mapping(target = "department", ignore = true)
    @Mapping(target = "roles", ignore = true)
    EmployeeDto employeeEntityToDto(EmployeeEntity employeeEntity);

    List<EmployeeDto> employeeEntityListToDtoList(List<EmployeeEntity> employeeEntities);

}
