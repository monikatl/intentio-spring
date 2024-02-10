package com.baszczyk.intentiospring.services;

import com.baszczyk.intentiospring.data.data.user.User;
import com.baszczyk.intentiospring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

  @Autowired
  UserRepository userRepository;


  public User addUser(User newUser) {
    return userRepository.save(newUser);
  }
  public User getUserById(Long id) {
    return userRepository.findById(id).orElse(null);
  }

  public List<User> getAllUsers() {
    return userRepository.findAll();
  }


  public boolean deleteUser(Long id) {
    if(userRepository.existsById(id)) {
      userRepository.deleteById(id);
      return true;
    } else {
      return false;
    }
  }

}
