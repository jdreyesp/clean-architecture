package com.jdreyesp.examples.cleanarchitecture.usecase;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class UserRequestModel {
    private String login;
    private String password;
}
