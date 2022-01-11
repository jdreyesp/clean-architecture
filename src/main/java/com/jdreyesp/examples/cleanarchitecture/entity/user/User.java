package com.jdreyesp.examples.cleanarchitecture.entity.user;

public interface User {

    boolean passwordIsValid();

    String getName();

    String getPassword();
}
