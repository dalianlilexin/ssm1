package com.yztc.service;

import java.util.List;

import com.yztc.pojo.User;

public interface UserService {
	// 查询所有
	public List<User> findAll();

	// 根据ID查找
	public User findById(int id);

	// 新增一个用户
	public void save(User user);

	// 根据id删除一个用户
	public void remove(User user);

	// 更改用户信息
	public void change(User user);
	
	public User findByIdAndUserName(User user);
	
	public List<User> findByNameUser(String name);
}
