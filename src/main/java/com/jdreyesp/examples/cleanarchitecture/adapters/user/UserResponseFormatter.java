package com.jdreyesp.examples.cleanarchitecture.adapters.user;

import com.jdreyesp.examples.cleanarchitecture.usecase.user.UserPresenter;
import com.jdreyesp.examples.cleanarchitecture.usecase.user.UserResponseModel;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class UserResponseFormatter implements UserPresenter {

    @Override
    public UserResponseModel prepareSuccessView(UserResponseModel response) {
        LocalDateTime responseTime = LocalDateTime.parse(response.getCreationTime());
        return new UserResponseModel(
                response.getName(),
                responseTime.format(DateTimeFormatter.ofPattern("hh:mm:ss"))
        );
    }

    @Override
    public UserResponseModel prepareFailView(String error) {
        throw new ResponseStatusException(HttpStatus.CONFLICT, error);
    }
}
