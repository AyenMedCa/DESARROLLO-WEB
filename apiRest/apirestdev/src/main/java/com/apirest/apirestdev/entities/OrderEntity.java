package com.apirest.apirestdev.entities;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Order")
public class OrderEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinTable(name = "user_order", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name = "order_id", referencedColumnName = "id"))
    private List<UserEntity> users;
    
    private LocalDate order_date;

    @ManyToOne
    @JoinColumn(name = "statu_id")
    private StatuEntity statu;       
}
