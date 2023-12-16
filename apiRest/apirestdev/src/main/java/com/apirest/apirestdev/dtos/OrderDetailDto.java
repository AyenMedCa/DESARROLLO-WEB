package com.apirest.apirestdev.dtos;

import java.util.Set;

public record OrderDetailDto(
    Integer id,
    Set<ProductDto> products,
    Integer quantity,
    Float subtotal
) {
    
}
