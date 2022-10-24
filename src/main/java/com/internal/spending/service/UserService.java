/*
 * VTB Group. Do not reproduce without permission in writing.
 * Copyright (c) 2022 VTB Group. All rights reserved.
 */

package com.internal.spending.service;

import com.internal.spending.model.dto.UserDto;
import reactor.core.publisher.Flux;

public interface UserService {

    Flux<UserDto> findAll();

    UserDto save(UserDto userDto);
}