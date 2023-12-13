package com.apirest.apirestdev.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.*;


import com.apirest.apirestdev.enums.ERole;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Role")
public class RoleEntity {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Integer id;

   @Enumerated(EnumType.STRING)
   private ERole name;
   
   @OneToMany(mappedBy = "role")
   private List<UserEntity> users;

   @OneToMany(mappedBy = "role")
   private List<SellerEntity> sellers;
}
