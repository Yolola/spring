package com.spring.test;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {

	public MyClassPathXmlApplicationContext(String... configLocations){
		super(configLocations);
	}

	@Override
	//父类为空,子类实现 扩展点
	protected void initPropertySources() {
		getEnvironment().setRequiredProperties("xxx");
	}

	@Override
	protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
		//设置是否允许BeanDefinition重写  默认为true
		super.setAllowBeanDefinitionOverriding(false);
		//设置是否允许玄幻依赖 默认为true
		super.setAllowCircularReferences(false);
		//添加BeanFactoryPostProcessor 到应用上下文context中
//		super.addBeanFactoryPostProcessor(new TestBFPP());
		//将以上两个标识设置到BeanFactory中
		super.customizeBeanFactory(beanFactory);

	}

	@Override
	protected void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) {
		System.out.println("扩展实现");
	}
}
