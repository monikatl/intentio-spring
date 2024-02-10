package com.baszczyk.intentiospring.data.data.user;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
  @JsonSubTypes.Type(value = Priest.class, name = "Priest"),
  @JsonSubTypes.Type(value = Parishioner.class, name = "Parishioner")
})
@Table(name = "user_table")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id", nullable = false)
  private Long id;

  private String login;
  private String password;

  @Column(name = "first_name")
  private String firstName;
  private String name;
  private String address;
  private String email;
  private String number;

  @Enumerated(EnumType.STRING)
  private Role role;

}
