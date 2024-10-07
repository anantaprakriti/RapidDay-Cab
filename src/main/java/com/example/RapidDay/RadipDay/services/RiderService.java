package com.example.RapidDay.RadipDay.services;

import com.example.RapidDay.RadipDay.dto.DriverDTO;
import com.example.RapidDay.RadipDay.dto.RideDTO;
import com.example.RapidDay.RadipDay.dto.RideRequestDTO;
import com.example.RapidDay.RadipDay.dto.RiderDTO;

import java.util.List;

public interface RiderService {
    RideDTO cancelRide(Long rideId);



    DriverDTO rateDriver(Long rideId, Integer rating);

    RiderDTO getMyProfile();

    List<RideDTO> getAllMyRides();
    RideRequestDTO requestRide(RideRequestDTO rideRequestDTO);

}
