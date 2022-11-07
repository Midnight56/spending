/*
 * VTB Group. Do not reproduce without permission in writing.
 * Copyright (c) 2022 VTB Group. All rights reserved.
 */

package com.internal.spending.controllers;

import com.internal.spending.model.dto.UserDto;
import com.internal.spending.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public Flux<UserDto> getUsers() {
        return userService.findAll();
    }

    @PostMapping
    public Mono<UserDto> createUser(@RequestBody UserDto userDto) {
        return userService.create(userDto);
    }
}