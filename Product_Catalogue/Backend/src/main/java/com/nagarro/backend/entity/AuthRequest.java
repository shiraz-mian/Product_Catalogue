package com.nagarro.backend.entity;

public class AuthRequest {
	String user;
    String password;
    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public AuthRequest(String user, String password) {
        super();
        this.user = user;
        this.password = password;
    }
}
