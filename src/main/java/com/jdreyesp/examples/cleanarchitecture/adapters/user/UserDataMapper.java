package com.jdreyesp.examples.cleanarchitecture.adapters.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user")
public class UserDataMapper {

    @Id
    private String name;

    private String password;

    private LocalDateTime creationTime;
}
