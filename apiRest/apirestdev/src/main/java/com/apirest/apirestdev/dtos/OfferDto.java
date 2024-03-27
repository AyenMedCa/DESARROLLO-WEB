package com.apirest.apirestdev.dtos;
import java.util.List;

import lombok.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class OfferDto {
    private Integer id;
    private Float dc;
    private String sd;
    private String ed;
    private List<ProductDto> products;
}
