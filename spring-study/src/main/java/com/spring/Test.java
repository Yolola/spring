package com.spring;

import com.spring.config.JavaConfig;
import com.spring.service.ServiceTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		// 通过注解的配置启动完成spring上下文
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
//		applicationContext.register();
		//初始化spring环境
//		applicationContext.refresh();
		ServiceTest serviceTest = (ServiceTest) applicationContext.getBean("serviceTest");
		serviceTest.sout();
	}
}

