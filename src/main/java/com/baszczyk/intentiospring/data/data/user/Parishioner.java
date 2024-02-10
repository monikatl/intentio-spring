package com.baszczyk.intentiospring.data.data.user;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Parishioner extends User {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id", nullable = false)
  private Long id;

}
