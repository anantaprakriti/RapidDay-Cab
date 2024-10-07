package com.example.RapidDay.RadipDay.repositories;

import com.example.RapidDay.RadipDay.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
