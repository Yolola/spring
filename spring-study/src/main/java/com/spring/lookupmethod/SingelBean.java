package com.spring.lookupmethod;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class SingelBean {
	public void print() {
		ProtypeBean bean = methodInject();
		System.out.println("Bean ProtypeBean's HashCode " + bean.hashCode());
	}
		@Lookup
	public  ProtypeBean methodInject(){
		return null;
	}

}
