package com.spring.supplier;

/**
 * 自定义 静态方法来创建bean对象返回
 */
public class SupplierCreat {
	public static User createUser() {
		return new User("lzt");
	}
}
