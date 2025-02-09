package com.github.wallace.biblioteca_online.services;

import com.github.wallace.biblioteca_online.entities.User;
import com.github.wallace.biblioteca_online.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User save(User user) {
       return userRepository.save(user);
    }
}
