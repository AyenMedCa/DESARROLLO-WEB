package com.apirest.apirestdev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apirest.apirestdev.entities.SellerEntity;

@Repository
public interface SellerRepository extends JpaRepository<SellerEntity,Integer>{
}
