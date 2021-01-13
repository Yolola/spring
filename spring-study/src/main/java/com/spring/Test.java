package com.spring;

import com.spring.test.MyClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class Test {
	public static void main(String[] args) {
		// 通过注解的配置启动完成spring上下文
//		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
		ApplicationContext applicationContextXml = new MyClassPathXmlApplicationContext("classpath:spring.xml");
//		applicationContext.register();
		//初始化spring环境
//		applicationContext.refresh();
//		ServiceTest serviceTest = (ServiceTest) applicationContext.getBean("serviceTest");
//		serviceTest.sout();
//		Customer customer = applicationContextXml.getBean(Customer.class);
//		System.out.println(customer.toString());
	}
}

