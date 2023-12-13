package com.apirest.apirestdev.entities;


import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Seller")
public class SellerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String firstName;

    private String lastName;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private RoleEntity role;

    @Email(message = "the email must be valid")
    private String mail;

    private String description;

    private String address;

    private Float rating;

    private Integer number_phone;
}
