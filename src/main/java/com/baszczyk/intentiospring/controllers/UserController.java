package com.baszczyk.intentiospring.controllers;

import com.baszczyk.intentiospring.data.data.user.User;
import com.baszczyk.intentiospring.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

  @Autowired
  private UserService userService;

  // Load one user by id

  @GetMapping("/users/{id}")
  public ResponseEntity<User> getUserById(@PathVariable Long id) {
    User user = userService.getUserById(id);
    if(user == null ){
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    return new ResponseEntity<>(user, HttpStatus.OK);
  }

  // Load all users
  @GetMapping("/users")
  public ResponseEntity<List<User>> getAllUsers() {
    List<User> users = userService.getAllUsers();
    if(users== null || users.isEmpty()){
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    return new ResponseEntity<>(users, HttpStatus.OK);
  }

  //------------------------------------ POST --------------------------------------------------------

  // Add store action to warehouse
  @PostMapping("/users")
  public ResponseEntity<User> createUser(@PathVariable Long warehouseId, @RequestBody User newUser) {
    User user = userService.addUser(newUser);
    if( user!= null) {
      return new ResponseEntity<>(user, HttpStatus.OK);
    }
    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
  }

  //------------------------------------ PUT --------------------------------------------------------

  //------------------------------------ DELETE --------------------------------------------------------

  // Delete store action by id
  @DeleteMapping("/users/{id}")
  public ResponseEntity<Void> deleteUser(@PathVariable("id") Long id) {
    if (userService.deleteUser(id)) {
      return ResponseEntity.noContent().build();
    } else {
      return ResponseEntity.notFound().build();
    }

  }

}
