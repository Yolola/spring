package com.spring.config;

import com.spring.beanpostprocessor.MyBeanPostProcessor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.spring.config2")
@Import(MyBeanPostProcessor.class)
public class JavaConfig {
}
