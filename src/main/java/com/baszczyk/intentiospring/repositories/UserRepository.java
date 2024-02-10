package com.baszczyk.intentiospring.repositories;

import com.baszczyk.intentiospring.data.data.user.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
}
