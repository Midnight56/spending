/*
 * VTB Group. Do not reproduce without permission in writing.
 * Copyright (c) 2022 VTB Group. All rights reserved.
 */

package com.internal.spending.service.impl;

import com.internal.spending.mappers.UserMapper;
import com.internal.spending.model.entities.UserEntity;
import com.internal.spending.repository.UserRepository;
import com.internal.spending.model.dto.UserDto;
import com.internal.spending.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public Flux<UserDto> findAll() {
        return userRepository.findAll()
                .map(userMapper::toDto);
    }

    @Override
    public Mono<UserDto> create(UserDto userDto) {
        log.debug("Creating new user {}", userDto);
        UserEntity userEntity = userMapper.toEntity(userDto);
        Mono<UserEntity> monoUserEntity = userRepository.save(userEntity);
        log.debug("new user saved with id {}", monoUserEntity);
        return monoUserEntity.map(userMapper::toDto);
    }
}