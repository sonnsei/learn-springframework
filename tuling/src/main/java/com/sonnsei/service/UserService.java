package com.sonnsei.service;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService implements BeanNameAware {

	@Autowired
	private OrderService orderService;

	public void test(){
		System.out.println(orderService);
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("BeanNameAware "+name);
	}
}
