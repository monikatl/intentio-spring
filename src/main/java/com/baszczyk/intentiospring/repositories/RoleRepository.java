package com.baszczyk.intentiospring.repositories;

import com.baszczyk.intentiospring.data.data.user.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(String name);
}
