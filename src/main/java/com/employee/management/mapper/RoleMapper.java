package com.employee.management.mapper;

import com.employee.management.dto.RoleDto;
import com.employee.management.model.RoleEntity;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Set;

@Mapper(componentModel = "spring")
public interface RoleMapper {

    RoleDto roleEntityToRoleDto(RoleEntity roleEntity);

    Set<RoleDto> roleEntitiesToRoleDtos(Set<RoleEntity> roleEntities);
}
