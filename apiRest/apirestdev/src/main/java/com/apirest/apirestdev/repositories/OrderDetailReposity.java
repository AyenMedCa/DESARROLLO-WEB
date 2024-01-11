package com.apirest.apirestdev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apirest.apirestdev.entities.OrderDetailEntity;

@Repository
public interface OrderDetailReposity extends JpaRepository <OrderDetailEntity, Integer>{
}
