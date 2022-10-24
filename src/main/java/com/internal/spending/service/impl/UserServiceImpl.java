/*
 * VTB Group. Do not reproduce without permission in writing.
 * Copyright (c) 2022 VTB Group. All rights reserved.
 */

package com.internal.spending.service.impl;

import com.internal.spending.repository.UserRepository;
import com.internal.spending.model.dto.UserDto;
import com.internal.spending.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public Flux<UserDto> findAll() {
        return userRepository.findAll()
                .map(UserDto::new);
    }

    @Override
    public UserDto save(UserDto userDto) {
        return null;
    }
}