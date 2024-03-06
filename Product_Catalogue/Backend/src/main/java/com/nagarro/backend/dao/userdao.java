package com.nagarro.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.backend.entity.user;

public interface userdao extends JpaRepository<user,String> {

}
