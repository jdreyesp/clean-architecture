package com.jdreyesp.examples.cleanarchitecture.entity.user;

public interface UserFactory {

    User create(String name, String password);

}
