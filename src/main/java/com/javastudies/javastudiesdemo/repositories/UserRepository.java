package com.javastudies.javastudiesdemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.javastudies.javastudiesdemo.domain.user.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findUserByDocument(String document);
    Optional<User> findUserById(Long id);
}
