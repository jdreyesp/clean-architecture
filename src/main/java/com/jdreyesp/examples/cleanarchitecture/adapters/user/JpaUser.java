package com.jdreyesp.examples.cleanarchitecture.adapters.user;

import com.jdreyesp.examples.cleanarchitecture.usecase.user.UserDsRequestModel;
import com.jdreyesp.examples.cleanarchitecture.usecase.user.UserRegisterDsGateway;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class JpaUser implements UserRegisterDsGateway {

    private final JPAUserRepository repository;

    @Override
    public boolean existsByName(String name) {
        return repository.existsById(name);
    }

    @Override
    public void save(UserDsRequestModel requestModel) {
        UserDataMapper accountDataMapper = new UserDataMapper(requestModel.getLogin(), requestModel.getPassword(), requestModel.getCreationTime());
        repository.save(accountDataMapper);
    }
}
