package com.iqmsoft.struts.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iqmsoft.struts.spring.dao.UserDAO;
import com.iqmsoft.struts.spring.po.User;
import com.iqmsoft.struts.spring.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDAO userDao;

	@Override
	public List<User> find(String name) {
		return userDao.findAll();
	}


}
