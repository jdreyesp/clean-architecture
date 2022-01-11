package com.jdreyesp.examples.cleanarchitecture.usecase;

/**
 * This acts as an output boundary for making use of the outer layers
 */
public interface UserRegisterDsGateway {
    boolean existsByName(String name);

    void save(UserDsRequestModel requestModel);
}
