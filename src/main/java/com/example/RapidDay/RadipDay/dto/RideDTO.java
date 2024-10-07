package com.example.RapidDay.RadipDay.dto;

import com.example.RapidDay.RadipDay.entities.Driver;
import com.example.RapidDay.RadipDay.entities.Rider;
import com.example.RapidDay.RadipDay.entities.enums.PaymentMethod;
import com.example.RapidDay.RadipDay.entities.enums.RideStatus;
import jakarta.persistence.*;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

public class RideDTO {
    private Long id;

    private Point pickupLocation;

    private Point dropOffLocation;
    private LocalDateTime requestedTime;

    private RiderDTO rider;


    private DriverDTO driver;



    private PaymentMethod paymentMethod;


    private RideStatus rideStatus;

    private Double fare;

    private LocalDateTime startedAt;//otp time

    private LocalDateTime endedAt;//dest reached time

}
