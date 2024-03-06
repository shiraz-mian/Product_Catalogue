package com.nagarro.backend.services;

import com.nagarro.backend.entity.user;

public interface userserv {
	public void userdata();
	public user adduser(user userdata);
	public boolean isUser(String user, String password);
}
