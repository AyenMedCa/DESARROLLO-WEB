package com.apirest.apirestdev.dtos;

import java.util.Set;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class OrderDetailDto {
    private Integer id;
    private Integer Order_id;
    private Set<ProductDto> products;
    private Integer quantity;
    private Float subtotal; 
}
