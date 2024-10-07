package com.example.RapidDay.RadipDay.strategies;

import com.example.RapidDay.RadipDay.dto.RideRequestDTO;
import com.example.RapidDay.RadipDay.entities.Driver;

import java.util.List;

public interface DriverMatchingStrategy {
     List<Driver> findMatchingDriver(RideRequestDTO rideRequestDTO);

}
