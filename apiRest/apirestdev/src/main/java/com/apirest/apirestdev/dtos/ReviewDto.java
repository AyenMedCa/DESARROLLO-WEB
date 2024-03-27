package com.apirest.apirestdev.dtos;
import java.util.Set;

import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class ReviewDto {
    private Integer id;
    private Set<ProductDto> products;
    private Set<UserDto> users;
    private Integer rating;
    private String comment;
    private String timestamp;
}
