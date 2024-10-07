package com.example.RapidDay.RadipDay.dto;

import com.example.RapidDay.RadipDay.entities.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private String name;
    private String email;

    private Set<Role> roles;
}
