package com.baszczyk.intentiospring.data.data.user;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
@Entity
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
  @JsonSubTypes.Type(value = Priest.class, name = "Priest"),
  @JsonSubTypes.Type(value = Parishioner.class, name = "Parishioner")
})
@Table(name = "user_table", uniqueConstraints = {
  @UniqueConstraint(columnNames = {"username"}),
  @UniqueConstraint(columnNames = {"email"})
})
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id", nullable = false)
  private Long id;

  private String username;
  private String password;

  @Column(name = "first_name")
  private String firstName;
  private String name;
  private String address;
  private String email;
  private String number;


  @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
  @JoinTable(name = "user_roles",
    joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
  private Set<Role> roles;

}
