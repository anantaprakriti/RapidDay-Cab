package com.example.RapidDay.RadipDay.dto;

import lombok.Data;

@Data
public class PointDTO {
    private double[] coordinates;
    private String type="Point";

    public PointDTO (double[] coordinates){
        this.coordinates=coordinates;
    }
}
