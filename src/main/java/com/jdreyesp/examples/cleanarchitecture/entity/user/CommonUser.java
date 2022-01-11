package com.jdreyesp.examples.cleanarchitecture.entity.user;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CommonUser implements User {

    String name;
    String password;

    public boolean passwordIsValid() {
        return password != null && password.length() > 5;
    }

}
