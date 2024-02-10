package com.baszczyk.intentiospring.data.data.user;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "role")
public class Role {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column(length = 60)
  private String name;
}
