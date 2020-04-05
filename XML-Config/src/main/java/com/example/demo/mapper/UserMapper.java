package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import com.example.demo.model.User;

@Mapper
public interface UserMapper {
	
	public List<User> findALL();
	public int insert(User user);
    public int update(User user);
    public int delete(int id);
    public User selectUserById(int id);

}		
