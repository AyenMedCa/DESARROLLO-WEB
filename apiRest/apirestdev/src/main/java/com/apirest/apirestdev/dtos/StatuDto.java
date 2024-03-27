package com.apirest.apirestdev.dtos;

import java.util.List;

import lombok.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class StatuDto {
    private Integer id;
    private String name;
    private List<OrderDto> orders;
}
