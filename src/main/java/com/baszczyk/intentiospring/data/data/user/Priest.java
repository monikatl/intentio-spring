package com.baszczyk.intentiospring.data.data.user;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Priest extends User{
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id", nullable = false)
  private Long id;

}
