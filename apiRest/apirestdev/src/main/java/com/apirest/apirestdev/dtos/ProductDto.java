package com.apirest.apirestdev.dtos;

public record ProductDto(
    Integer id,
    String name,
    SellerDto seller,
    OfferDto offer,
    String description,
    Float price,
    Integer stock,
    String url_image
) {
    
}
