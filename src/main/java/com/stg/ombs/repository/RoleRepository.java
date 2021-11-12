package com.stg.ombs.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stg.ombs.entity.ERole;
import com.stg.ombs.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(ERole name); 

}
