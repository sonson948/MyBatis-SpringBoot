package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;

@Service
public class Userservice {
	@Autowired
	private UserMapper userMapper;
	
	public List<User> selectALL(){
		return userMapper.findALL();
	}
	
//	public int insert(UserMapper userMapper) {
//		return userMapper.insert(userMapper);
//	}
//	public int update(UserMapper userMapper) {
//		return userMapper.update(userMapper);
//	}
	
	public int delete(int id) {
		return userMapper.delete(id);
	}
	
	public User selectUserById(int id) {
		return userMapper.selectUserById(id);
	}
}
