package com.jdreyesp.examples.cleanarchitecture.usecase;

/**
 * This acts as an input boundary for defining contracts on how components interact
 */
public interface UserInputBoundary {
    UserResponseModel create(UserRequestModel requestModel);
}
