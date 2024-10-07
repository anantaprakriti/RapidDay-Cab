package com.example.RapidDay.RadipDay.services;

import com.example.RapidDay.RadipDay.dto.DriverDTO;
import com.example.RapidDay.RadipDay.dto.RideDTO;

import java.util.List;

public interface DriverService {
    RideDTO cancelRide(Long rideId);
    RideDTO startRide(Long rideId);

    RideDTO endRide(Long rideId);
    RideDTO acceptRide(Long rideId);

    RideDTO rateRider(Long rideId, Integer rating);

    DriverDTO getMyProfile();

    List<RideDTO> getAllMyRides();
}
