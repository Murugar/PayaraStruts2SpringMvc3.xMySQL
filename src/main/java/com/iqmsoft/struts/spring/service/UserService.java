package com.iqmsoft.struts.spring.service;

import java.util.List;

import com.iqmsoft.struts.spring.po.User;

public interface UserService {
	List<User> find(String name);
}
