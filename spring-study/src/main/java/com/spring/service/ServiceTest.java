package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class ServiceTest  {//implements ApplicationContextAware
	@Autowired
	ApplicationContext applicationContext;

	public void sout(){
//		TestDao testDao = applicationContext.getBean("testDao", TestDao.class);
//		testDao.testDaoSout();
		System.out.println("Hello");
	}

	//这是spring 后置处理器中提供的功能
//	@Override
//	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//		this.applicationContext=applicationContext;
//	}
}
