package com.jdreyesp.examples.cleanarchitecture.usecase.user;

/**
 * This acts as an output boundary for making use of the outer layers.
 * If we have called this UserDsGateway we could probably have violated the interface segregation principle from SOLID.
 */
public interface UserRegisterDsGateway {
    boolean existsByName(String name);

    void save(UserDsRequestModel requestModel);
}
