package com.example.RapidDay.RadipDay.repositories;

import com.example.RapidDay.RadipDay.entities.Rider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RiderRepository extends JpaRepository<Rider,Long> {
}
