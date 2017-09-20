package com.iqmsoft.struts.spring.service.impl;

import org.springframework.stereotype.Service;

import com.iqmsoft.struts.spring.service.HelloService;

@Service
public class HelloServiceImpl implements HelloService{
	
	public String sayHello() {
		return "Hello World";
	}

}
