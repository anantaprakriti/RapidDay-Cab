package com.example.RapidDay.RadipDay.repositories;

import com.example.RapidDay.RadipDay.entities.RideRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RideRequestRepository extends JpaRepository<RideRequest,Long> {
}
