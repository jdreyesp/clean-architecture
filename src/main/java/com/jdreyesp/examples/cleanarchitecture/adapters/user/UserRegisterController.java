package com.jdreyesp.examples.cleanarchitecture.adapters.user;

import com.jdreyesp.examples.cleanarchitecture.usecase.user.UserInputBoundary;
import com.jdreyesp.examples.cleanarchitecture.usecase.user.UserRequestModel;
import com.jdreyesp.examples.cleanarchitecture.usecase.user.UserResponseModel;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class UserRegisterController {

    final UserInputBoundary userInput;

    @PostMapping("/user")
    UserResponseModel create(@RequestBody UserRequestModel requestModel) {
        return userInput.create(requestModel);
    }
}
