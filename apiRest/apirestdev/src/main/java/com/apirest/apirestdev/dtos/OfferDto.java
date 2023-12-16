package com.apirest.apirestdev.dtos;

import java.time.LocalDate;

public record OfferDto(
        Integer id,
        Float discount_porcent,
        LocalDate start_date,
        LocalDate end_date
) {
    
}
