package com.apirest.apirestdev.dtos;


import com.apirest.apirestdev.enums.ERole;

public record RoleDto(
    Integer id,
    ERole name
) {
    
}
