package com.smartresidesolutions.base.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.smartresidesolutions.base.model.UserDto;
import com.smartresidesolutions.base.repository.UserDao;
import com.smartresidesolutions.entities.User;

@Transactional
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserDao userDao;

	@Override
	public UserDto getUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveUser(UserDto userDto) {
		User user=new User();
		ModelMapper modelMapper = new ModelMapper();
		user = modelMapper.map(userDto, User.class);
		userDao.saveUser(user);
		
	}

	@Override
	public void deleteUser(UserDto user) {
		// TODO Auto-generated method stub
		
	}
	

}
