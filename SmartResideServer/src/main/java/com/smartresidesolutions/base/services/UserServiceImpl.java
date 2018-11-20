package com.smartresidesolutions.base.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.smartresidesolutions.base.model.MenuDto;
import com.smartresidesolutions.base.model.UserDto;
import com.smartresidesolutions.base.repository.UserDao;
import com.smartresidesolutions.entities.MenuEntity;
import com.smartresidesolutions.entities.RoleEntity;
import com.smartresidesolutions.entities.UserEntity;

@Transactional
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserDao userDao;

	@Override
	public UserDto getUser(UserDto userDto) {
		
		UserEntity userEntity=userDao.getUser(userDto);
		List<MenuEntity> menuList=new ArrayList();
		for(RoleEntity role:userEntity.getRoleList()) {
			
			menuList.addAll(role.getMenuList());
			
			
			
		}
		userDto.setUserRole("Admin");
		ModelMapper modelMapper = new ModelMapper();
		java.lang.reflect.Type listType = new TypeToken<List<MenuEntity>>() {}.getType();
		List<MenuDto> menuListForDto = modelMapper.map(menuList, listType);
		menuListForDto.removeAll(Collections.singleton(null));
		userDto.setMenuList(menuListForDto);
		return userDto;
	}

	@Override
	public void saveUser(UserDto userDto) {
		UserEntity user=new UserEntity();
		ModelMapper modelMapper = new ModelMapper();
		user = modelMapper.map(userDto, UserEntity.class);
		userDao.saveUser(user);
		
	}

	@Override
	public void deleteUser(UserDto user) {
		// TODO Auto-generated method stub
		
	}
	

}
