package com.apirest.apirestdev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apirest.apirestdev.entities.OfferEntity;


@Repository
public interface OfferRepository extends JpaRepository <OfferEntity, Integer>{
}
