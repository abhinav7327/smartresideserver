package com.smartresidesolutions.base.repository;

import com.smartresidesolutions.base.model.UserDto;
import com.smartresidesolutions.entities.UserEntity;

public interface UserDao {

	
	public UserEntity getUser(UserDto userDto);
	
	public void saveUser(UserEntity user);
	
	public void deleteUser(UserEntity user);
	
}
