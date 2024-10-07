package com.example.RapidDay.RadipDay.strategies.impl;

import com.example.RapidDay.RadipDay.dto.RideRequestDTO;
import com.example.RapidDay.RadipDay.strategies.RideFareCalculationStrategy;

public class RideFareDefaultFareCalculationStrategy implements RideFareCalculationStrategy {
    @Override
    public double calculateFare(RideRequestDTO rideRequestDTO) {
        return 0;
    }
}
