package com.example.springboot_ehcache.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;

import com.example.springboot_ehcache.entity.Users;




@CacheConfig(cacheNames = "userCache")//xml配置文件cache的名称
public interface UserMapper {
	@Select("SELECT ID ,NAME,AGE FROM t_user where id=#{id}")
	@Cacheable
	List<Users> getUser(@Param("id") Long id);
}
