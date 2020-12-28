package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		// 通过注解的配置启动完成spring上下文
//		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
		ApplicationContext applicationContextXml = new ClassPathXmlApplicationContext("classpath:spring.xml");
//		applicationContext.register();
		//初始化spring环境
//		applicationContext.refresh();
//		ServiceTest serviceTest = (ServiceTest) applicationContext.getBean("serviceTest");
//		serviceTest.sout();
	}
}

