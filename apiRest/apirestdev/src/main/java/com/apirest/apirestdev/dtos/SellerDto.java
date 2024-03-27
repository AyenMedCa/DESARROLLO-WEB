package com.apirest.apirestdev.dtos;

import java.util.List;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class SellerDto {
    private Integer id;
    private String fn;
    private String ln;
    private String role;
    private String mail;
    private String description;
    private String address;
    private Float rating;
    private Integer number_phone;
    private List<ProductDto> products;
}
