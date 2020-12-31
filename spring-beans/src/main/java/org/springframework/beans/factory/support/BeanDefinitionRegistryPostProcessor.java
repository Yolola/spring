/*
 * Copyright 2002-2010 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.beans.factory.support;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;

/**
 * Extension to the standard {@link BeanFactoryPostProcessor} SPI, allowing for
 * the registration of further bean definitions <i>before</i> regular
 * BeanFactoryPostProcessor detection kicks in. In particular,
 * BeanDefinitionRegistryPostProcessor may register further bean definitions
 * which in turn define BeanFactoryPostProcessor instances.
 *
 * @author Juergen Hoeller
 * @since 3.0.1
 * @see org.springframework.context.annotation.ConfigurationClassPostProcessor
 */

/**
 * 对标准{@link BeanFactoryPostProcessor} SPI的扩展，允许在进行常规BeanFactoryPostProcessor检测之前在<i>之前注册更多的bean定义。
 * -------------------------------------下面这句话非常重要-------------------------------------
 * -------------------------------------下面这句话非常重要-------------------------------------
 * -------------------------------------下面这句话非常重要-------------------------------------
 * 特别是，BeanDefinitionRegistryPostProcessor可以注册进一步的bean定义，
 * 这些bean definitions又定义了BeanFactoryPostProcessor实例。
 */
public interface BeanDefinitionRegistryPostProcessor extends BeanFactoryPostProcessor {

	/**
	 * Modify the application context's internal bean definition registry after its
	 * standard initialization. All regular bean definitions will have been loaded,
	 * but no beans will have been instantiated yet. This allows for adding further
	 * bean definitions before the next post-processing phase kicks in.
	 * @param registry the bean definition registry used by the application context
	 * @throws org.springframework.beans.BeansException in case of errors
	 */
	/**
	 * 这个方法可以注册实现 BeanFactoryPostProcessor的BeanDifinition
	 * 他出现的意义就是为了不在BeanFactoryPostProcessor中注册BeanFactoryPostProcessor出现死循环无法处理
	 * 如果你要注册BeanFactoryPostProcessor就去实现BeanDefinitionRegistryPostProcessor接口，如果你在
	 * BeanFactoryPostProcessor中注册BeanFactoryPostProcessor，新增的将不会执行回调
	 * @param registry
	 * @throws BeansException
	 */
	void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException;

}
