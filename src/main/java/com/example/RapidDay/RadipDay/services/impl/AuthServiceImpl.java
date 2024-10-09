package com.example.RapidDay.RadipDay.services.impl;

import com.example.RapidDay.RadipDay.dto.DriverDTO;
import com.example.RapidDay.RadipDay.dto.SignupDTO;
import com.example.RapidDay.RadipDay.dto.UserDTO;
import com.example.RapidDay.RadipDay.entities.Ride;
import com.example.RapidDay.RadipDay.entities.Rider;
import com.example.RapidDay.RadipDay.entities.User;
import com.example.RapidDay.RadipDay.entities.enums.Role;
import com.example.RapidDay.RadipDay.repositories.RiderRepository;
import com.example.RapidDay.RadipDay.repositories.UserRepository;
import com.example.RapidDay.RadipDay.services.AuthService;
import com.example.RapidDay.RadipDay.services.RiderService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    private final RiderRepository riderRepository;
    private final RiderService riderService;
    @Override
    public String login(String email, String password) {
        return "";
    }

    @Override
    public UserDTO signup(SignupDTO signupDTO) {

        User user=userRepository.findByEmail(signupDTO.getEmail());
        if(user!=null){
            throw new RuntimeException("cannot sign up , User already exist" + signupDTO.getEmail());



        }
        user=modelMapper.map(signupDTO,User.class);
        user.setRoles(Set.of(Role.RIDER));
        User savedUser=userRepository.save(user);

        //create user related entries
        Rider rider=riderService.createNewRider(savedUser);
        //todo add wallet related service

        return modelMapper.map(savedUser,UserDTO.class);



    }

    @Override
    public DriverDTO onboardNewDriver(Long userId) {
        return null;
    }
}
