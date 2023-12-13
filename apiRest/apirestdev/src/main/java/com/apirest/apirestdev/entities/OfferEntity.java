package com.apirest.apirestdev.entities;

import lombok.AllArgsConstructor;
import lombok.*;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.*;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Offer")
public class OfferEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Float discount_porcent;

    private LocalDate start_date;

    private LocalDate end_date;

    @OneToMany(mappedBy = "offer")
    private List<ProductEntity> products;
}
