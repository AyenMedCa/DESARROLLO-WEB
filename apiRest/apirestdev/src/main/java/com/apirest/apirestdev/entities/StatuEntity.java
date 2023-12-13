package com.apirest.apirestdev.entities;

import com.apirest.apirestdev.enums.Statu;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Statu")
public class StatuEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Enumerated(EnumType.STRING)
    private Statu name;

    @OneToMany(mappedBy = "statu")
    private List<OrderEntity> orders;
}
