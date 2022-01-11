package com.jdreyesp.examples.cleanarchitecture.entity;

public interface User {

    boolean passwordIsValid();

    String getName();

    String getPassword();
}
