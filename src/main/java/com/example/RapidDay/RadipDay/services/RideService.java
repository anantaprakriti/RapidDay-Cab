package com.example.RapidDay.RadipDay.services;

import com.example.RapidDay.RadipDay.dto.RideDTO;
import com.example.RapidDay.RadipDay.dto.RideRequestDTO;
import com.example.RapidDay.RadipDay.entities.Ride;
import com.example.RapidDay.RadipDay.entities.enums.RideStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface RideService {
     Ride getRideById(Long rideId);

     void matchWithDrivers(RideRequestDTO rideRequestDTO);

     Ride createNewRide(RideRequestDTO rideRequestDTO);

     Ride updateRideStatus(Long rideId, RideStatus rideStatus);

     Page<Ride> getAllRidesOfRider(Long riderId, PageRequest pageRequest);

}
