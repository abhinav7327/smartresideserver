package com.smartresidesolutions.base.repository;

import javax.persistence.Query;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.smartresidesolutions.base.model.UserDto;
import com.smartresidesolutions.entities.UserEntity;

@Repository
public class UserDaoImpl implements UserDao {
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public UserEntity getUser(UserDto userDto) {
		Query query = sessionFactory.getCurrentSession().getNamedQuery("findUserByEmail").setString("email",userDto.getEmail());
		UserEntity userEntity=(UserEntity)query.getSingleResult();
		return userEntity;
	}

	@Override
	public void saveUser(UserEntity user) {
		sessionFactory.getCurrentSession().save(user);

	}

	@Override
	public void deleteUser(UserEntity user) {
		// TODO Auto-generated method stub

	}

}
