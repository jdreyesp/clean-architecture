package com.jdreyesp.examples.cleanarchitecture.usecase;

public interface UserRegisterDsGateway {
    boolean existsByName(String name);

    void save(UserDsRequestModel requestModel);
}
