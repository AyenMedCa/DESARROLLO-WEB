package com.apirest.apirestdev.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
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
}
