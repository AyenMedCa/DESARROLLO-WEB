package com.apirest.apirestdev.dtos;

import java.time.LocalDate;

public record OrderDto(
    Integer id,
    LocalDate order_date,
    StatuDto statu
) {
    
}
