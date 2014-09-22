package com.king.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.king.entity.User;
import com.king.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@Controller
public class UserAction extends ActionSupport implements ModelDriven<User>{
	private User user;
	
	@Resource
	private UserService userService;
	public String add(){
		if(userService.save(user)){
			return "add";
		}else{
			return "login";
		}
		
	}

	public String findById(){
		User u = userService.findById(user.getId());
		if(u != null){
			System.out.println(u.getName() +  " "  + u.getAge());
			return "add";
		}else{
			return "login";
		}
	}
	
	@Override
	public User getModel() {
		if(user == null){
			user = new User();
		}
		return user;
	}

}
