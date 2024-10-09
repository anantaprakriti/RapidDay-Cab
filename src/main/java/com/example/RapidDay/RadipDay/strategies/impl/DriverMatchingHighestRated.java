package com.example.RapidDay.RadipDay.strategies.impl;

import com.example.RapidDay.RadipDay.dto.RideRequestDTO;
import com.example.RapidDay.RadipDay.entities.Driver;
import com.example.RapidDay.RadipDay.entities.RideRequest;
import com.example.RapidDay.RadipDay.strategies.DriverMatchingStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DriverMatchingHighestRated implements DriverMatchingStrategy {
    @Override
    public List<Driver> findMatchingDriver(RideRequest rideRequest) {
        return null;
    }
}
