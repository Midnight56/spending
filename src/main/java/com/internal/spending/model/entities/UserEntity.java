/*
 * VTB Group. Do not reproduce without permission in writing.
 * Copyright (c) 2022 VTB Group. All rights reserved.
 */

package com.internal.spending.model.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@Document(collection = "users")
public class UserEntity {

    @MongoId
    private String id;
    private String firstname;
    private String lastname;
    private String login;
    private String password;
    private Timestamp lastActivity;
}