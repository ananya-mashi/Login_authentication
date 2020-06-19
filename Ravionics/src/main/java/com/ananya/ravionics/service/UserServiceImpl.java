package com.ananya.ravionics.service;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ananya.ravionics.bean.User;
import com.ananya.ravionics.dao.UserDao;

@Service
public class UserServiceImpl implements UserService{
 
	private UserDao dao;
	
	@Autowired
	public UserServiceImpl(UserDao userdao){
	dao=userdao;
	}
	
	@Override
	public User findByUSERNAME(String uSERNAME) {
		Optional<User> result=dao.findByUSERNAME(uSERNAME);
		User user=null;
		if(result.isPresent()){
			user=result.get();
		}return user;
		}
	}

