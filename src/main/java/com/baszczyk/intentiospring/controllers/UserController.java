package com.baszczyk.intentiospring.controllers;

import com.baszczyk.intentiospring.services.UserService;
import com.baszczyk.intentiospring.data.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users/login")
    public ResponseEntity<User> loginWarehouse(@RequestParam String name, @RequestParam String password) {
        User user = userService.getUserByNameAndPassword(name, password);
        if(user != null)
            return new ResponseEntity<>(user, HttpStatus.OK);
        else return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/users/all")
    public List<User> getAll() {
        return userService.getAllUsers();
    }

}
