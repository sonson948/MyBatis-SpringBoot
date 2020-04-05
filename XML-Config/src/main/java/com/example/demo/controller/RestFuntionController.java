package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ResponeData;
import com.example.demo.model.User;
import com.example.demo.mapper.UserMapper;

@RestController
public class RestFuntionController {
	@Autowired
	private UserMapper userMapper;

	@GetMapping(value= {"/all","/delete/all"})
	public List<User> listUser(){
		return userMapper.findALL();
	}
//	@PostMapping("/ChangeUser")
//	public ResponeData Change() {
//		ResponeData  restponedata = new ResponeData(); 
//		restponedata.setStt("thanh cong");
//		User user=new User();
//		user.setUsername("a");
//		user.setPass("1233");
//		restponedata.setStuden(user);	
//		return restponedata;
//	}

//	@GetMapping(value= {"/list","/delete/list"})
	
}
