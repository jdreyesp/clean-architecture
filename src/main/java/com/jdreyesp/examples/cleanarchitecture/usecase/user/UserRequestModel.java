package com.jdreyesp.examples.cleanarchitecture.usecase.user;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UserRequestModel {
    private String login;
    private String password;
}
