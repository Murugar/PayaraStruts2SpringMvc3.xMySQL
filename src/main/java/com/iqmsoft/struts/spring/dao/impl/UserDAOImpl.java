package com.iqmsoft.struts.spring.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.iqmsoft.struts.spring.dao.BaseDAO;
import com.iqmsoft.struts.spring.dao.UserDAO;
import com.iqmsoft.struts.spring.po.User;

@Repository
public class UserDAOImpl extends BaseDAO implements UserDAO {

	@Override
	public List<User> findAll() {
		String hql="from User";
		return this.getHibernateTemplate().find(hql);
	}
}
