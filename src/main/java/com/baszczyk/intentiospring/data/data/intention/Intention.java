package com.baszczyk.intentiospring.data.data.intention;

import com.baszczyk.intentiospring.data.data.user.User;
import jakarta.persistence.*;
import lombok.Data;

@Data
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


  @OneToOne(cascade = CascadeType.ALL)
  @PrimaryKeyJoinColumn(name = "content_id")
  private IntentionContent content;


  public Intention() {
  }

}

