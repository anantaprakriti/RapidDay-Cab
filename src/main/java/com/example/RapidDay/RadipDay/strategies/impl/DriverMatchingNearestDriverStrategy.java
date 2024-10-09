package com.example.RapidDay.RadipDay.strategies.impl;

import com.example.RapidDay.RadipDay.dto.RideRequestDTO;
import com.example.RapidDay.RadipDay.entities.Driver;
import com.example.RapidDay.RadipDay.entities.RideRequest;
import com.example.RapidDay.RadipDay.repositories.DriverRepository;
import com.example.RapidDay.RadipDay.strategies.DriverMatchingStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DriverMatchingNearestDriverStrategy implements DriverMatchingStrategy {
    private final DriverRepository driverRepository;


    @Override
    public List<Driver> findMatchingDriver(RideRequest rideRequest) {

        return driverRepository.findMatchingDriver(rideRequest.getPickupLocation());
    }
}
