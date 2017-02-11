package com.yztc.dao;

import java.util.List;

import com.yztc.pojo.User;

//用来统一规范的
public interface UserDao {
	//查询所有
	public List<User> findAll();
	
	//根据ID查找
	public User findById(int id);
	
	//根据ID和用户名的组合查找
	public User findByIdAndUserName(User user);
	
	//新增一个用户
	public void save(User user);
	
	//根据id删除一个用户
	public void remove(User user);
	
	//更改用户信息
	public void change(User user);
	
	public List<User> findByNameUser(String name);
	
}
