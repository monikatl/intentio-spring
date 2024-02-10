package com.baszczyk.intentiospring.services;

import com.baszczyk.intentiospring.data.data.user.User;
import com.baszczyk.intentiospring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class UserService implements UserDetailsService {

  @Autowired
  UserRepository userRepository;

  @Override
  public UserDetails loadUserByUsername(String usernameOrEmail) throws UsernameNotFoundException {
    User user = userRepository.findByUsernameOrEmail(usernameOrEmail, usernameOrEmail)
      .orElseThrow(() ->
        new UsernameNotFoundException("User not found with username or email: "+ usernameOrEmail));

    Set<GrantedAuthority> authorities = user
      .getRoles()
      .stream()
      .map((role) -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toSet());

    return new org.springframework.security.core.userdetails.User(user.getEmail(),
      user.getPassword(),
      authorities);
  }


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
