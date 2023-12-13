package com.apirest.apirestdev.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import java.util.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "User")
public class UserEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "rol_id")
    private RoleEntity role;
    
    private String firstName;

    private String lastName;

    @Email(message = "the email must be valid")
    private String mail;

    private String password;

    private String address;

    @ManyToMany(mappedBy = "users")
    private Set<OrderEntity> orders;

    @ManyToMany(mappedBy = "users")
    private Set<ReviewEntity> review;
}
