package com.iqmsoft.struts.spring.web.action.users;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.iqmsoft.struts.spring.po.User;
import com.iqmsoft.struts.spring.service.UserService;
import com.opensymphony.xwork2.ActionSupport;


@Controller
@ParentPackage(value = "ssh2-default")
public class UserAction extends ActionSupport{
	@Autowired
	private UserService userService;
	
	
	private List<User> users;
	

	public List<User> getUsers() {
		return users;
	}


	@Action("list")
	public String list(){
		users=userService.find("test1");
		return SUCCESS;
	}
}
