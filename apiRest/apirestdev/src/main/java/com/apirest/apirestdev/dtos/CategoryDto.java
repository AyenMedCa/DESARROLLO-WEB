package com.apirest.apirestdev.dtos;

import com.apirest.apirestdev.enums.Category;

public record CategoryDto(
    Integer id,
    Category name
) {
    
}
