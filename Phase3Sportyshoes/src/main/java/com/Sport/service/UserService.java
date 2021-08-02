package com.Sport.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.Sport.Doa.UserRegistrationDto;
import com.Sport.entity.User;

public interface UserService extends UserDetailsService {
	User save(UserRegistrationDto registrationDto);

}
