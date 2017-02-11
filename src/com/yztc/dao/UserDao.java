package com.yztc.dao;

import java.util.List;

import com.yztc.pojo.User;

//����ͳһ�淶��
public interface UserDao {
	//��ѯ����
	public List<User> findAll();
	
	//����ID����
	public User findById(int id);
	
	//����ID���û�������ϲ���
	public User findByIdAndUserName(User user);
	
	//����һ���û�
	public void save(User user);
	
	//����idɾ��һ���û�
	public void remove(User user);
	
	//�����û���Ϣ
	public void change(User user);
	
	public List<User> findByNameUser(String name);
	
}
