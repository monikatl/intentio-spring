package com.baszczyk.intentiospring.data.data.intention;

import com.baszczyk.intentiospring.data.data.user.User;
import jakarta.persistence.*;

@Entity
@Table(name = "intention_table")
public class Intention {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name="kind")
  @Enumerated(EnumType.STRING)
  private IntentionKind kind;

  @Column(name="content")
  private IntentionContent content;

  @Column(name="orderer_user")
  private User ordererUser;


  public Intention() {
  }


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }
}

