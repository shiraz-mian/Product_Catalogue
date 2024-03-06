package com.nagarro.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.backend.dao.userdao;
import com.nagarro.backend.entity.user;

@Service
public class userserviceimpl implements userserv {
	
	@Autowired
	private userdao User;
	
	@Override
	public void userdata() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public user adduser(user userdata) {
		// TODO Auto-generated method stub
		return User.save(userdata);
	}

	@Override
	public boolean isUser(String user, String password) {
		// TODO Auto-generated method stub
		  if(User.existsById(user)  && User.findById(user).get().getPassword().equals(password)) return true;
		return false;
	}
	

}
