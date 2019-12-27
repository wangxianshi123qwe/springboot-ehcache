package com.example.springboot_ehcache.api.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot_ehcache.entity.Users;
import com.example.springboot_ehcache.service.UserService;



@RestController
public class IndexControoller {
	@Autowired
	private UserService userService;
	@Autowired
	private CacheManager cacheManager;



	@RequestMapping("/remoKey")
	public void remoKey() {
		cacheManager.getCache("userCache").clear();
	}

	@RequestMapping("/getUser")
	public List<Users> getUser(Long id) {
		return userService.getUser(id);
	}

/*	@RequestMapping("/ehcaChePut")
	public String put(String key, String value) {
		mapEhcaChe.put(key, value);
		return "success";
	}*/

	

}
