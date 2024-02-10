package com.baszczyk.intentiospring.data.data.intention;

import jakarta.persistence.*;
import lombok.Data;

@Data
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

  @OneToOne(mappedBy = "content")
  private Intention intention;

}
