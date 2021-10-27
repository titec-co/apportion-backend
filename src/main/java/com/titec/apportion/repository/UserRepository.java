package com.titec.apportion.repository;

import com.titec.apportion.common.model.user.User;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;


public interface UserRepository extends R2dbcRepository<User, String> {

    Mono<User> findByUsername(String username);

}
