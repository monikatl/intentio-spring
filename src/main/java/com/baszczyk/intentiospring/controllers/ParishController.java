package com.baszczyk.intentiospring.controllers;

import com.baszczyk.intentiospring.data.data.user.Parish;
import com.baszczyk.intentiospring.repositories.ParishRepository;
import com.baszczyk.intentiospring.services.ParishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping()
public class ParishController {
  @Autowired
  private ParishService parishService;

  @PostMapping("/createParish")
  public Parish createParish(@RequestBody Parish parish) {
    Parish newParish = parishService.createParish(parish);
    return newParish;
  }

  @GetMapping("/parish")
  public ResponseEntity<Parish> getParish() {
    Parish parish = parishService.getParishById(1L);
    if(parish != null) {
      return new ResponseEntity<>(parish, HttpStatus.OK);
    }
    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
  }
}
