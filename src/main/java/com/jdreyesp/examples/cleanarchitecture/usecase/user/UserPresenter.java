package com.jdreyesp.examples.cleanarchitecture.usecase.user;

/**
 * This acts as an output boundary for making use of the outer layers
 */
public interface UserPresenter {

    UserResponseModel prepareSuccessView(UserResponseModel user);

    UserResponseModel prepareFailView(String error);
}
