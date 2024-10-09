package com.example.RapidDay.RadipDay.strategies;

import com.example.RapidDay.RadipDay.dto.RideRequestDTO;
import com.example.RapidDay.RadipDay.entities.RideRequest;
import org.springframework.stereotype.Service;


public interface RideFareCalculationStrategy {

    double calculateFare(RideRequest rideRequest);


}
