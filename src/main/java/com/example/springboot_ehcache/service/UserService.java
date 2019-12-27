package com.example.springboot_ehcache.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot_ehcache.entity.Users;
import com.example.springboot_ehcache.mapper.UserMapper;




@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;

	public List<Users> getUser(Long id) {
		return userMapper.getUser(id);
	}

}
