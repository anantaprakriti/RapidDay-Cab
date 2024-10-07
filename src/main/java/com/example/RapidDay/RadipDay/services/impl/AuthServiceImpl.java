package com.example.RapidDay.RadipDay.services.impl;

import com.example.RapidDay.RadipDay.dto.DriverDTO;
import com.example.RapidDay.RadipDay.dto.SignupDTO;
import com.example.RapidDay.RadipDay.dto.UserDTO;
import com.example.RapidDay.RadipDay.services.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public String login(String email, String password) {

    }

    @Override
    public UserDTO signup(SignupDTO signupDTO) {
        return null;
    }

    @Override
    public DriverDTO onboardNewDriver(Long userId) {
        return null;
    }
}
