package com.github.wallace.biblioteca_online.repositories;

import com.github.wallace.biblioteca_online.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByName(String name);
}
