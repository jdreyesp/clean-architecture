package com.jdreyesp.examples.cleanarchitecture.usecase.user;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public class UserDsRequestModel {
    private String login;
    private String password;
    private LocalDateTime creationTime;
}
