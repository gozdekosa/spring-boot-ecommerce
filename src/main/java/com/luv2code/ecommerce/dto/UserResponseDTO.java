package com.luv2code.ecommerce.dto;

import com.luv2code.ecommerce.model.UserRole;
import lombok.Data;

@Data
public class UserResponseDTO {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private UserRole role;
    private AddressDTO address;
}
