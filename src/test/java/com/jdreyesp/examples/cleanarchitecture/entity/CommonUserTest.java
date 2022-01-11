package com.jdreyesp.examples.cleanarchitecture.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommonUserTest {

    @Test
    void shouldNotBeAGoodPasswordWhenAnInvalidPasswordIsPassed() {
        //Given
        String invalidPassword = "123";
        CommonUser commonUserSUT = new CommonUser("Hank", invalidPassword);

        //When
        boolean valid = commonUserSUT.passwordIsValid();

        //Then
        assertFalse(valid);
    }
}