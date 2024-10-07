package com.example.RapidDay.RadipDay.services.impl;

import com.example.RapidDay.RadipDay.dto.DriverDTO;
import com.example.RapidDay.RadipDay.dto.RideDTO;
import com.example.RapidDay.RadipDay.dto.RideRequestDTO;
import com.example.RapidDay.RadipDay.dto.RiderDTO;
import com.example.RapidDay.RadipDay.services.RiderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RiderServiceImpl implements RiderService {
    @Override
    public RideDTO cancelRide(Long rideId) {
        return null;
    }

    @Override
    public DriverDTO rateDriver(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public RiderDTO getMyProfile() {
        return null;
    }

    @Override
    public List<RideDTO> getAllMyRides() {
        return null;
    }

    @Override
    public RideRequestDTO requestRide(RideRequestDTO rideRequestDTO) {
        return null;
    }
}
