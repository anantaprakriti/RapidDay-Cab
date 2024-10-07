package com.example.RapidDay.RadipDay.entities;

import com.example.RapidDay.RadipDay.entities.enums.PaymentMethod;
import com.example.RapidDay.RadipDay.entities.enums.PaymentStatus;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch=FetchType.LAZY)
    private Ride ride;

    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;

    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;

    private Double amount;

    @CreationTimestamp
    private LocalDateTime paymentTime;

}
