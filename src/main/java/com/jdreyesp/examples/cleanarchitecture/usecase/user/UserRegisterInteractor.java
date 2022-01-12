package com.jdreyesp.examples.cleanarchitecture.usecase.user;

import com.jdreyesp.examples.cleanarchitecture.entity.user.User;
import com.jdreyesp.examples.cleanarchitecture.entity.user.UserFactory;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * This implementation assumes that there is an UI controlled by UserPresenter (from the UseCases layer)
 * and some persistence layer (managed by UserRegisterDsGateway (from the UseCases layer as well))
 */
@Component
@AllArgsConstructor
public class UserRegisterInteractor implements UserInputBoundary {

    final UserRegisterDsGateway userDsGateway;
    final UserPresenter userPresenter;
    final UserFactory userFactory;

    public UserResponseModel create(UserRequestModel requestModel) {
        if (userDsGateway.existsByName(requestModel.getLogin())) {
            return userPresenter.prepareFailView("User already exists.");
        }
        User user = userFactory.create(requestModel.getLogin(), requestModel.getPassword());
        if (!user.passwordIsValid()) {
            return userPresenter.prepareFailView("User password must have more than 5 characters.");
        }

        LocalDateTime now = LocalDateTime.now();
        UserDsRequestModel userDsModel = new UserDsRequestModel(user.getName(), user.getPassword(), now);

        userDsGateway.save(userDsModel);

        UserResponseModel accountResponseModel = new UserResponseModel(user.getName(), now.toString());
        return userPresenter.prepareSuccessView(accountResponseModel);
    }
}
