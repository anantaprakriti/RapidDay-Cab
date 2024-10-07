package com.example.RapidDay.RadipDay.services;

import com.example.RapidDay.RadipDay.dto.DriverDTO;
import com.example.RapidDay.RadipDay.dto.SignupDTO;
import com.example.RapidDay.RadipDay.dto.UserDTO;

public interface AuthService {
    String login(String email, String password);
    UserDTO signup(SignupDTO signupDTO);
    DriverDTO onboardNewDriver(Long userId);
}
