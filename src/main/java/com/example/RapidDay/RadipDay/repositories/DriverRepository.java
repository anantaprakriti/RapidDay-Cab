package com.example.RapidDay.RadipDay.repositories;

import com.example.RapidDay.RadipDay.entities.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends JpaRepository<Driver,Long> {
}
