package com.example.RapidDay.RadipDay.dto;

import com.example.RapidDay.RadipDay.entities.Rider;
import com.example.RapidDay.RadipDay.entities.enums.PaymentMethod;
import com.example.RapidDay.RadipDay.entities.enums.RideRequestStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RideRequestDTO {
    private Long id;

    private Point pickupLocation;

    private Point dropOffLocation;
    private LocalDateTime requestedTime;
    private Rider rider;


    private PaymentMethod paymentMethod;


    private RideRequestStatus rideRequestStatus;

}
