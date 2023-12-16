package com.apirest.apirestdev.dtos;

public record UserDto(
    Integer id,
    String firstName,
    String lastName,
    String mail,
    String address
) {
    
}
