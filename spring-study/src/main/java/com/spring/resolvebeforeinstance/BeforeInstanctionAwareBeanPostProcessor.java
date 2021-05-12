package com.spring.resolvebeforeinstance;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.stereotype.Component;

@Component
public class BeforeInstanctionAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {
	/**
	 * 初始化之前执行
	 * @param bean the new bean instance
	 * @param beanName the name of the bean
	 * @return
	 * @throws BeansException
	 */
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(beanName+"执行方法：=========================postProcessBeforeInitialization");
		return null;
	}

	/**
	 * 初始化之后执行
	 * @param bean the new bean instance
	 * @param beanName the name of the bean
	 * @return
	 * @throws BeansException
	 */
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(beanName+"执行方法：=========================postProcessAfterInitialization");
		return null;
	}

	/**
	 * 实例化之前执行
	 * @param beanClass the class of the bean to be instantiated
	 * @param beanName the name of the bean
	 * @return
	 * @throws BeansException
	 */
	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		System.out.println(beanName+"执行方法：=========================postProcessBeforeInstantiation");
		if(beanClass==BeforeInstanction.class){
			Enhancer enhancer=new Enhancer();
			enhancer.setSuperclass(beanClass);
			enhancer.setCallback(new MyMethodInterceptor());
			BeforeInstanction beforeInstanction = (BeforeInstanction) enhancer.create();
			System.out.println("创建代理对象完成------");
			return beforeInstanction;
		}
		return null;
	}

	/**
	 * 实例化之后执行
	 * @param bean the bean instance created, with properties not having been set yet
	 * @param beanName the name of the bean
	 * @return
	 * @throws BeansException
	 */
	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		System.out.println(beanName+"执行方法：=========================postProcessAfterInstantiation");
		return false;
	}

	@Override
	public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
		System.out.println(beanName+"执行方法：=========================postProcessProperties");
		return null;
	}
}
