package com.stg.ombs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stg.ombs.entity.JobDetails;

public interface JobRepository extends JpaRepository<JobDetails, Long> {

}
