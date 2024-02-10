package com.baszczyk.intentiospring.services;

import com.baszczyk.intentiospring.repositories.ParishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParishService {

  @Autowired
  private ParishRepository parishRepository;


}
