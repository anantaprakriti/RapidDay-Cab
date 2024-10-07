package com.example.RapidDay.RadipDay.strategies;

import com.example.RapidDay.RadipDay.dto.RideRequestDTO;
import com.example.RapidDay.RadipDay.entities.RideRequest;

public interface RideFareCalculationStrategy {

    double calculateFare(RideRequestDTO rideRequestDTO);


}
