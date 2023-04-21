package com.employee.management.mapper;

import com.employee.management.dto.EmployeeDto;
import com.employee.management.model.EmployeeEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", uses = {RoleMapper.class, DepartmentMapper.class})
public interface EmployeeMapper {


    EmployeeDto employeeEntityToDto(EmployeeEntity employeeEntity);

    List<EmployeeDto> employeeEntityListToDtoList(List<EmployeeEntity> employeeEntities);

    @Mapping(source = "department.id", target = "department.id")
    EmployeeEntity employeeDtoToEntity(EmployeeDto employeeDto);

    List<EmployeeEntity> employeeDtoListToEntityList(List<EmployeeDto> employeeDtos);

}
