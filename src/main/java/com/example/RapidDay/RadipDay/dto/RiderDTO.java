package com.example.RapidDay.RadipDay.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RiderDTO {
    private UserDTO user;
    private double rating;
}
