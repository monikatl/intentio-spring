package com.baszczyk.intentiospring.controllers;

import com.baszczyk.intentiospring.data.data.user.Parish;
import com.baszczyk.intentiospring.repositories.ParishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/parish")
public class ParishController {
  @Autowired
  private ParishRepository parishRepository;

  @PostMapping("/createParish")
  public Parish createParish(@RequestBody Parish parish) {
    Parish newParish = parishRepository.save(parish);
    return newParish;
  }

  @GetMapping("/getParish/{id}")
  public String getParish(@PathVariable(name = "id") Long id) {
    System.out.println("Owner get called...");
    Parish ownerOut = parishRepository.getById(id);
    System.out.println("\nOwner details with Blogs :: \n" + ownerOut);

    return "Owner fetched...";
  }
}
