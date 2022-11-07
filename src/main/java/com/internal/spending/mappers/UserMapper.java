/*
 * VTB Group. Do not reproduce without permission in writing.
 * Copyright (c) 2022 VTB Group. All rights reserved.
 */

package com.internal.spending.mappers;

import com.internal.spending.model.dto.UserDto;
import com.internal.spending.model.entities.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(target = "password", ignore = true)
    UserDto toDto(UserEntity entity);

    UserEntity toEntity(UserDto dto);
}