package com.baszczyk.intentiospring.data.data.user;

import jakarta.persistence.*;

@Entity
@Table(name = "place_table")
public class Place {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id", nullable = false)
  private Long id;

  private String address;
  private String name;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }
}
