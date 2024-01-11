package com.apirest.apirestdev.services;

import java.util.Optional;

import com.apirest.apirestdev.dtos.ProductDto;
import com.apirest.apirestdev.entities.ProductEntity;

public interface ProductService {
    ProductDto create(ProductEntity product);
    //Optional<ProductDto> update(Integer id, ProductDto product);
}
