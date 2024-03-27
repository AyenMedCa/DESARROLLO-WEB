package com.apirest.apirestdev.dtos;

import java.util.List;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoleDto {

    private Integer id;
    private String name;
    private List<UserDto> users;
    private List<SellerDto> sellers;
    
}
