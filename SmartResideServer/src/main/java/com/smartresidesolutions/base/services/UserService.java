package com.smartresidesolutions.base.services;

import org.springframework.stereotype.Service;

import com.smartresidesolutions.base.model.UserDto;

@Service
public interface UserService {

	public UserDto getUser(UserDto userDto);
	
	public void saveUser(UserDto user);
	
	public void deleteUser(UserDto user);
	
}
