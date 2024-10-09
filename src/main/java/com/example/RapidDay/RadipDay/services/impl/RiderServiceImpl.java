package com.example.RapidDay.RadipDay.services.impl;

import com.example.RapidDay.RadipDay.dto.DriverDTO;
import com.example.RapidDay.RadipDay.dto.RideDTO;
import com.example.RapidDay.RadipDay.dto.RideRequestDTO;
import com.example.RapidDay.RadipDay.dto.RiderDTO;
import com.example.RapidDay.RadipDay.entities.RideRequest;
import com.example.RapidDay.RadipDay.entities.enums.RideRequestStatus;
import com.example.RapidDay.RadipDay.services.RiderService;
import com.example.RapidDay.RadipDay.strategies.DriverMatchingStrategy;
import com.example.RapidDay.RadipDay.strategies.RideFareCalculationStrategy;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class RiderServiceImpl implements RiderService {

    private final ModelMapper modelMapper;
    private final RideFareCalculationStrategy rideFareCalculationStrategy;
    private final DriverMatchingStrategy driverMatchingStrategy;
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
        RideRequest rideRequest=modelMapper.map(rideRequestDTO,RideRequest.class);
        rideRequest.setRideRequestStatus(RideRequestStatus.PENDING);

        double fare= rideFareCalculationStrategy.calculateFare(rideRequest);
        rideRequest.setFare(fare);
        driverMatchingStrategy.findMatchingDriver(rideRequest);
//

        return modelMapper.map(rideRequest,RideRequestDTO.class);
    }
}
