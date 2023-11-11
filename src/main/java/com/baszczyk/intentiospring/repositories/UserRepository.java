package com.baszczyk.intentiospring.repositories;

import com.baszczyk.intentiospring.data.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByNameAndPassword(String username, String password);
}
