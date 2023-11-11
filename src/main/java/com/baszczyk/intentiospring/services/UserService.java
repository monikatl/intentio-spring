package com.baszczyk.intentiospring.services;

import com.baszczyk.intentiospring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baszczyk.intentiospring.data.User;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUserByNameAndPassword(String name, String password) {
        return userRepository.findByNameAndPassword(name, password);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
