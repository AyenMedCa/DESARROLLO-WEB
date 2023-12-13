package com.apirest.apirestdev.entities;

import lombok.*;
import jakarta.persistence.*;
import java.util.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Order_detail")
public class OrderDetailEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private OrderEntity order;

    @ManyToMany
    @JoinTable(
        name = "order_detail_product",
        joinColumns = @JoinColumn(name = "product_id", referencedColumnName = "id"),
        inverseJoinColumns = @JoinColumn(name = "order_detail_id", referencedColumnName = "id"))
    private Set<ProductEntity> products;

    private Integer quantity;

    private Float subtotal;
}
