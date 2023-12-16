package com.apirest.apirestdev.dtos;

public record SellerDto(
        Integer id, 
        String firstname, 
        String lastname,
        RoleDto role, 
        String mail, 
        String description, 
        String address, 
        Float rating, 
        Integer number_phone
){
    
}
