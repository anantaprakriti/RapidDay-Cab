package com.example.RapidDay.RadipDay.strategies.impl;

import com.example.RapidDay.RadipDay.dto.RideRequestDTO;
import com.example.RapidDay.RadipDay.entities.Driver;
import com.example.RapidDay.RadipDay.strategies.DriverMatchingStrategy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverMatchingNearestDriverStrategy implements DriverMatchingStrategy {
    @Override
    public List<Driver> findMatchingDriver(RideRequestDTO rideRequestDTO) {
        return null;
    }
}
