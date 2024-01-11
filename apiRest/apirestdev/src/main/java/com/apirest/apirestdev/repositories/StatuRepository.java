package com.apirest.apirestdev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apirest.apirestdev.entities.StatuEntity;

@Repository
public interface StatuRepository extends JpaRepository<StatuEntity, Integer>{
}
