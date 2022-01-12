package com.jdreyesp.examples.cleanarchitecture.entity.user;

import org.springframework.stereotype.Component;

@Component
public class CommonUserFactory implements UserFactory {
    public User create(String name, String password) {
        return new CommonUser(name, password);
    }
}
