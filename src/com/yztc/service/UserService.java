package com.yztc.service;

import java.util.List;

import com.yztc.pojo.User;

public interface UserService {
	// ��ѯ����
	public List<User> findAll();

	// ����ID����
	public User findById(int id);

	// ����һ���û�
	public void save(User user);

	// ����idɾ��һ���û�
	public void remove(User user);

	// �����û���Ϣ
	public void change(User user);
	
	public User findByIdAndUserName(User user);
	
	public List<User> findByNameUser(String name);
}
