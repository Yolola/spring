package com.spring.resolvebeforeinstance;

import org.springframework.stereotype.Component;

/**
 * 自定义代理实现执行方法 只有两个 实例化前-->初始化后
 * sout:
 * beforeInstanction执行方法：=========================postProcessBeforeInstantiation
 * 创建代理对象完成------
 * beforeInstanction执行方法：=========================postProcessAfterInitialization
 */
@Component
public class BeforeInstanction {
	public void doSomething(){
		System.out.println("做一些时期 执行 doSomething方法！");
	}
}
