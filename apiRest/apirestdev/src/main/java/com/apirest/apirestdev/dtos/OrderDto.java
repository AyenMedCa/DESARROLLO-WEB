package com.apirest.apirestdev.dtos;

import java.util.List;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class OrderDto {
    private Integer id;
    private List<UserDto> users;
    private String order_date;
    private Integer statu_id;
}
