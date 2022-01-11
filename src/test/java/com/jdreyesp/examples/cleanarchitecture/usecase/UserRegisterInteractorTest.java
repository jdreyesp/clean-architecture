package com.jdreyesp.examples.cleanarchitecture.usecase;

import com.jdreyesp.examples.cleanarchitecture.entity.CommonUserFactory;
import com.jdreyesp.examples.cleanarchitecture.entity.UserFactory;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;

import static org.mockito.Mockito.*;

class UserRegisterInteractorTest {

    UserFactory userFactory = new CommonUserFactory();

    @Test
    void shouldPrepareSuccessViewOnCorrect() {
        //Given
        String userName = "hank";
        UserRegisterDsGateway userDsGateway = mock(UserRegisterDsGateway.class);
        when(userDsGateway.existsByName(userName)).thenReturn(false);
        UserPresenter userPresenter = mock(UserPresenter.class);
        UserRegisterInteractor interactor = new UserRegisterInteractor(userDsGateway, userPresenter, userFactory);
        ArgumentCaptor<UserDsRequestModel> userDsRequestModel = ArgumentCaptor.forClass(UserDsRequestModel.class);
        ArgumentCaptor<UserResponseModel> userResponseModel = ArgumentCaptor.forClass(UserResponseModel.class);

        UserRequestModel userRequestModel = new UserRequestModel(userName, "123456");

        //When
        interactor.create(userRequestModel);

        //Then
        verify(userDsGateway).save(userDsRequestModel.capture());
        assert(userDsRequestModel.getValue().getLogin() == userRequestModel.getLogin());
        assert(userDsRequestModel.getValue().getPassword() == userRequestModel.getPassword());

        verify(userPresenter).prepareSuccessView(userResponseModel.capture());
        assert(userResponseModel.getValue().getName() == userName);

    }

}