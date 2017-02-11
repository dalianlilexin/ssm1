package com.yztc.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yztc.dao.UserDao;
import com.yztc.pojo.User;
import com.yztc.service.UserService;


@Service("userService")
public class UserServiceImpl implements UserService{
	@Autowired   //注入的属性通常设置成public的
	public UserDao userDao;   //由UserMapper.xml实现注入的实现类对象
	
	@Override
	public List<User> findAll() {
		return userDao.findAll();
	}

	@Override
	public User findById(int id) {
		return userDao.findById(id);
	}

	@Override
	public void save(User user) {
		userDao.save(user);
	}

	@Override
	public void remove(User user) {
		userDao.remove(user);
	}

	@Override
	public void change(User user) {
		userDao.change(user);
	}

	@Override
	public User findByIdAndUserName(User user) {
		// TODO Auto-generated method stub
		return userDao.findByIdAndUserName(user);
	}

	@Override
	public List<User> findByNameUser(String name) {
		// TODO Auto-generated method stub
		return userDao.findByNameUser(name);
	}

}
