package com.apirest.apirestdev.entities;

import lombok.*;
import jakarta.persistence.*;
import java.util.*;
import java.time.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Review")
public class ReviewEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToMany()
    @JoinTable(
        name = "review_product",
        joinColumns = @JoinColumn(name = "review_id"),
        inverseJoinColumns = @JoinColumn(name = "product_id"))
    private Set<ProductEntity> products;

    @ManyToMany
    @JoinTable(
        name = "review_user",
        joinColumns = @JoinColumn(name = "review_id"),
        inverseJoinColumns = @JoinColumn(name = "user_id"))
    private Set<UserEntity> users;

    private Integer rating;

    private String comment;

    private LocalDate timestamp;
}
