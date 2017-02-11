package com.yztc.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yztc.pojo.User;
import com.yztc.service.UserService;

public class SSMTest {
	public UserService service;
	
	@Before
	public void init(){
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		service = (UserService) appContext.getBean("userService");
	}
	
	@Test
	public void findAll(){
		List<User> users = service.findAll();
		for(User u : users){
			System.out.println(u);
		}
	}
	
	@Test
	public void findById(){
		User u = service.findById(1);
		System.out.println(u);
	}
	
	@Test
	public void save(){
		User user = new User();
		user.setId(10);
		user.setUser_name("zhangtai");
		user.setAge(20);
		user.setRemark("dalian");
		service.save(user);
	}
	
	@Test
	public void remove(){
		User user = new User();
		user.setId(10);
		service.remove(user);
	}
	
	@Test
	public void change(){
		User user = new User();
		user.setId(6);
		user.setUser_name("zhangtai");
		user.setAge(20);
		user.setRemark("dalian");
		service.change(user);
	}
}
