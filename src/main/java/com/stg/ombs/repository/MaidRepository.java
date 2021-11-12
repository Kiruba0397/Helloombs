package com.stg.ombs.repository;

import com.stg.ombs.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import com.stg.ombs.entity.Maid;

import java.util.Optional;

public interface MaidRepository extends JpaRepository<Maid, String> {


}
