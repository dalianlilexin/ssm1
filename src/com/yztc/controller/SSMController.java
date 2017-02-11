package com.yztc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yztc.pojo.User;
import com.yztc.service.UserService;

@Controller
public class SSMController {
	@Autowired
	public UserService userService;
	
	@RequestMapping("/regist")
	public String regist(User user){
		userService.save(user);
		return "success.jsp";
	}
	
	@RequestMapping("/loginUser")
	public String loginUser(User user,HttpServletRequest request){
		User u = userService.findByIdAndUserName(user);
		List<User> users = userService.findAll();
		request.setAttribute("users",users);
		return (u!=null) ? "user_main.jsp" : "redirect:create_new.jsp";
	}
	
	@RequestMapping("/saveUser")
	public String saveUser(User user,HttpServletRequest request) throws UnsupportedEncodingException{
		try{
			userService.save(user);
			List<User> users = userService.findAll();
			request.setAttribute("users",users);
			return "user_main.jsp";
		}catch(Exception e){
			return "error.jsp?msg=User add error";
		}
	}
	
	@RequestMapping("/deleteUser")
	public String deleteUser(User user,HttpServletRequest request){
		
		try{
			userService.remove(user);
			List<User> users = userService.findAll();
			request.setAttribute("users",users);
			return "user_main.jsp";
		}catch(Exception e){
			return "error.jsp?msg=User delete error";
		}
	}
	
	@RequestMapping("/updateUser")
	public String updateUser(User user,HttpServletRequest request){
		try{
			userService.change(user);
			List<User> users = userService.findAll();
			request.setAttribute("users",users);
			return "user_main.jsp";
		}catch(Exception e){
			return "error.jsp?msg=User update error";
		}
	}
	
	@RequestMapping("/findByIdUser")
	public String findByIdUser(int id,HttpServletRequest request,HttpServletResponse response) throws IOException{
		User u = userService.findById(id);
		
		String allRequest = "<table><tr><td>"+u.getId()+"</td><td>"+
		u.getUser_name()+"</td><td>"+u.getAge()+"</td><td>"+u.getRemark()+"</td></tr></table>";
		
		PrintWriter pw = response.getWriter();
		pw.write(allRequest);
		List<User> users = userService.findAll();
		request.setAttribute("users",users);
		return null;
	}
	
	@RequestMapping("/findByNameUser")
	public String findByNameUser(String name,HttpServletRequest request,HttpServletResponse response) throws IOException{
		List<User> users = userService.findByNameUser(name);
		
		String allRequest = "<table>";
		
		for(User u : users){
			allRequest += "<tr><td>"+u.getId()+"</td><td>"+
					u.getUser_name()+"</td><td>"+u.getAge()+"</td><td>"+u.getRemark()+"</td></tr>";
		}
		allRequest +="</table>";
	
		PrintWriter pw = response.getWriter();
		pw.write(allRequest);
		List<User> users2 = userService.findAll();
		request.setAttribute("users",users2);
		return null;
		
	}
}









