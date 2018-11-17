package com.smartresidesolutions.base.repository;

import com.smartresidesolutions.base.model.UserDto;
import com.smartresidesolutions.entities.User;

public interface UserDao {

	
	public User getUser();
	
	public void saveUser(User user);
	
	public void deleteUser(User user);
	
}
