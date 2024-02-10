package com.baszczyk.intentiospring.data.data.intention;

import jakarta.persistence.*;

@Entity
@Table(name = "intention_content_table")
public class IntentionContent {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id", nullable = false)
  private Long id;

  private String headline;
  private String body;
  private String name;
  private String from;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }
}
