package com.employee.management.mapper;

import com.employee.management.dto.DepartmentDto;
import com.employee.management.model.DepartmentEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface DepartmentMapper {

    DepartmentMapper INSTANCE = Mappers.getMapper(DepartmentMapper.class);

    DepartmentDto departmentEntityToDepartmentDto(DepartmentEntity departmentEntity);
}
