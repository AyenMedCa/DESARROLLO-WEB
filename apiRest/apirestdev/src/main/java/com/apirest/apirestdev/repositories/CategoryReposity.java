package com.apirest.apirestdev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apirest.apirestdev.entities.CategoryEntity;

@Repository
public interface CategoryReposity extends JpaRepository<CategoryEntity, Integer>{
    
}