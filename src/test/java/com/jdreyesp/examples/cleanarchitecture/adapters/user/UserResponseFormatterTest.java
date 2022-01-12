package com.jdreyesp.examples.cleanarchitecture.adapters.user;

import com.jdreyesp.examples.cleanarchitecture.usecase.user.UserResponseModel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserResponseFormatterTest {

    UserResponseFormatter userResponseFormatter = new UserResponseFormatter();

    @Test
    public void shouldFormatDateCorrectly() {
        //Given
        UserResponseModel modelResponse = new UserResponseModel("hank", "2020-12-20T03:00:00.000");

        //When
        UserResponseModel formattedResponse = userResponseFormatter.prepareSuccessView(modelResponse);

        assertEquals(formattedResponse.getCreationTime(), "03:00:00");
    }
}