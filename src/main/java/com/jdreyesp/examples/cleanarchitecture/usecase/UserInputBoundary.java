package com.jdreyesp.examples.cleanarchitecture.usecase;

public interface UserInputBoundary {
    UserResponseModel create(UserRequestModel requestModel);
}
