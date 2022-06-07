package com.example.springbootregistration.service;

import com.example.springbootregistration.model.User;
import com.example.springbootregistration.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
