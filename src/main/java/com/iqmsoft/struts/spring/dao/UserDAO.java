package com.iqmsoft.struts.spring.dao;

import java.util.List;

import com.iqmsoft.struts.spring.po.User;

public interface UserDAO {
	List<User> findAll();
}
