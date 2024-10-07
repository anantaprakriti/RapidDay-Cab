package com.example.RapidDay.RadipDay.services.impl;

import com.example.RapidDay.RadipDay.dto.DriverDTO;
import com.example.RapidDay.RadipDay.dto.RideDTO;
import com.example.RapidDay.RadipDay.services.DriverService;
import org.springframework.stereotype.Service;

import java.sql.Driver;
import java.util.List;

@Service
public class DriverServiceImpl implements DriverService {
    @Override
    public RideDTO cancelRide(Long rideId) {
        return null;
    }

    @Override
    public RideDTO startRide(Long rideId) {
        return null;
    }

    @Override
    public RideDTO endRide(Long rideId) {
        return null;
    }

    @Override
    public RideDTO acceptRide(Long rideId) {
        return null;
    }

    @Override
    public RideDTO rateRider(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public DriverDTO getMyProfile() {
        return null;
    }

    @Override
    public List<RideDTO> getAllMyRides() {
        return null;
    }
}
