package com.ahs.queueconfigurationapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.ahs.queueconfigurationapp.entity.ParagonQueue;


@Repository
public interface QueueRepository extends JpaRepository<ParagonQueue,Long > {
		
}
