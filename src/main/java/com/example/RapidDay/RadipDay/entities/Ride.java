package com.example.RapidDay.RadipDay.entities;

import com.example.RapidDay.RadipDay.entities.enums.PaymentMethod;
import com.example.RapidDay.RadipDay.entities.enums.RideRequestStatus;
import com.example.RapidDay.RadipDay.entities.enums.RideStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Ride {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "Geometry(Point, 4326)")
    private Point pickupLocation;
    @Column(columnDefinition = "Geometry(Point, 4326)")
    private Point dropOffLocation;
    private LocalDateTime requestedTime;
    @ManyToOne(fetch=FetchType.LAZY)
    private Rider rider;

    @ManyToOne(fetch=FetchType.LAZY)
    private Driver driver;


    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;

    @Enumerated(EnumType.STRING)
    private RideStatus rideStatus;

    private Double fare;

    private LocalDateTime startedAt;//otp time

    private LocalDateTime endedAt;//dest reached time

}
