package com.smartresidesolutions.base.repository;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.smartresidesolutions.base.model.UserDto;
import com.smartresidesolutions.entities.User;

@Repository
public class UserDaoImpl implements UserDao {
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public User getUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveUser(User user) {
		sessionFactory.getCurrentSession().save(user);

	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub

	}

}
