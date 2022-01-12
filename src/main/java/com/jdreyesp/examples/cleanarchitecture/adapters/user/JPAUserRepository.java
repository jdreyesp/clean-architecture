package com.jdreyesp.examples.cleanarchitecture.adapters.user;

import org.springframework.data.jpa.repository.JpaRepository;

interface JPAUserRepository extends JpaRepository<UserDataMapper, String> {}
