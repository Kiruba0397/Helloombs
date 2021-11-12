package com.stg.ombs.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stg.ombs.entity.Users;

public interface UserRepository extends JpaRepository<Users, Long> {
	Optional<Users> findByUsername(String username);
	Boolean existsByUsername(String username);
	Boolean existsByEmail(String email);

}
