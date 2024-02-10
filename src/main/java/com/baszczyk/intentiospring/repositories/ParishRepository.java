package com.baszczyk.intentiospring.repositories;

import com.baszczyk.intentiospring.data.data.user.Parish;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ParishRepository extends JpaRepository<Parish, Long> {
}
