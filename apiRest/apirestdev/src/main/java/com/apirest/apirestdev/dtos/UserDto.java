package com.apirest.apirestdev.dtos;

import java.util.Set;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class UserDto {
    private Integer id;
    private String role;
    private String fn;
    private String ln;
    private String mail;
    private Set<OrderDto> orders;
    private Set<ReviewDto> reviews;
}
