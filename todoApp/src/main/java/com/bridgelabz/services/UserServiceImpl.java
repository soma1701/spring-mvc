package com.bridgelabz.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bridgelabz.dao.UserDao;
import com.bridgelabz.model.User;

public class UserServiceImpl implements UserService{
	@Autowired
	UserDao userDao;


	public void register(User user) throws Exception {
		// TODO Auto-generated method stub
		userDao.register(user);
	}  

}
