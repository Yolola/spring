package com.spring.selfEditor;

import java.beans.PropertyEditorSupport;

/**
 * AddressEditor 当属性名为address时才生效 这里类名不可随意定义 必须时自定义属性类名+Editor
 * 这里如果不是AddressEditor 会报错
 */
public class AddressEditor extends PropertyEditorSupport {
	//TODO 等看到Bean实例化 后populate属性时  查看如何find到 AddressEditor ,调用setAsText方法
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		String[] s = text.split("_");
		Address address = new Address();
		address.setProvince(s[0]);
		address.setCity(s[1]);
		address.setTown(s[2]);
		setValue(address);
	}
}
