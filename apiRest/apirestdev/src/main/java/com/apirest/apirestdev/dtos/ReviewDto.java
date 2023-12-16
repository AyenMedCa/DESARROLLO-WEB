package com.apirest.apirestdev.dtos;

import java.time.LocalDate;

public record ReviewDto(
    Integer id,
    Integer rating,
    String comment,
    LocalDate timestamp
) {
    
}
