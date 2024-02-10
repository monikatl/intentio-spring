package com.baszczyk.intentiospring.data.data.user;

import jakarta.persistence.*;


public class Parish {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id", nullable = false)
  private Long id;

  private String patron;
  private String address;
  @OneToOne
  @JoinColumn(name = "parish_priest_id")
  private Priest parishPriest;


  public Priest getParishPriest() {
    return parishPriest;
  }

  public void setParishPriest(Priest parishPriest) {
    this.parishPriest = parishPriest;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


}
