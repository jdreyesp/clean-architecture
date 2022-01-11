package com.jdreyesp.examples.cleanarchitecture.usecase;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
@Setter
public class UserDsRequestModel {
    private String login;
    private String password;
    private LocalDateTime time;
}
