package com.jdreyesp.examples.cleanarchitecture.usecase;

public interface UserPresenter {

    UserResponseModel prepareSuccessView(UserResponseModel user);

    UserResponseModel prepareFailView(String error);
}
