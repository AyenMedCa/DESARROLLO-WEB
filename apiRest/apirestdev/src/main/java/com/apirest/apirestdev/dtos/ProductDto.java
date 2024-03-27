package com.apirest.apirestdev.dtos;

import java.util.List;
import java.util.Set;

import com.apirest.apirestdev.entities.CategoryEntity;
import com.apirest.apirestdev.enums.Category;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class ProductDto {
    private Integer id;
    private Integer seller_id;
    private Integer offer_id;
    private String name;
    private String description;
    private List<CategoryDto> categories;
    private Float price;
    private Integer stock;
    private String url_image;
    private Set<Integer> reviews_id;
    private Set<Integer> orders_detail_id;
}
