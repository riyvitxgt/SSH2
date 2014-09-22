package com.king.action;

import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

@Controller
public class TestAction extends ActionSupport{
	public String execute(){
		return super.SUCCESS;
	}
}
