package com.example.RapidDay.RadipDay.repositories;

import com.example.RapidDay.RadipDay.entities.Ride;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RideRepository extends JpaRepository<Ride,Long> {
}
