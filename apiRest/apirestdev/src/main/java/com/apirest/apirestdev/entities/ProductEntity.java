package com.apirest.apirestdev.entities;

import lombok.*;
import jakarta.persistence.*;
import java.util.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Product")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToMany(mappedBy = "role")
    private SellerEntity seller;


    @ManyToOne
    @JoinColumn(name = "offer_id")
    private OfferEntity offer;

    private String name;

    private String description;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "Product_category", joinColumns = @JoinColumn(name = "category_id", referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name = "product_id", referencedColumnName = "id"))
    private List<CategoryEntity> categories;

    private Float price;

    private Integer stock;

    private String url_image;

    @ManyToMany(mappedBy = "products")
    private Set<ReviewEntity> reviews;

    @ManyToMany(mappedBy = "products")
    private Set<OrderDetailEntity> orders_detail;
}
