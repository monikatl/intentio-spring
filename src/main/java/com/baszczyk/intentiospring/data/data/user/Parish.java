package com.baszczyk.intentiospring.data.data.user;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Parish {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id", nullable = false)
  private Long id;

  private String patron;
  private String address;
  private Long parishPriestId;

}
