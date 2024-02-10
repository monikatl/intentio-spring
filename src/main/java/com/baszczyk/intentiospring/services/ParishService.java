package com.baszczyk.intentiospring.services;

import com.baszczyk.intentiospring.data.data.user.Parish;
import com.baszczyk.intentiospring.repositories.ParishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParishService {

  @Autowired
  private ParishRepository parishRepository;

  public Parish getParishById(Long id) {
    return parishRepository.findById(id).orElse(null);
  }

  public Parish createParish(Parish parish) {
    return parishRepository.save(parish);
  }
}
