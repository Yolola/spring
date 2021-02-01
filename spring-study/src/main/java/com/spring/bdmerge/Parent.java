package com.spring.bdmerge;

import org.springframework.stereotype.Component;

/**
 * abstract 和 parent 属性可以当做用来减少xml重复代码的方法,可以将一些 bean 的公共属性抽取出来,放到一个公共的 bean 中,然后使用上面的栗子进行配置,来让 xml 文件更加简洁.
 * 值得注意的是, parent 属性配置的 bean 之间,并不一定需要有实际的继承关系,更多的是属性的继承.被设置为 parent 的 bean 甚至可以不用映射到某一个具体的类,而仅仅将其当做属性模板来使用.
 * 更像是一种模板，把公共的东西抽象出来
 * 这样,abstractBean 就起到了一个模板的作用,可以减少重复定义,这里只有简单的几个属性,所以可能看起来不是很直观,可以想象一下,如果 abstractBean 中有一二十个公用属性,是不是可以少写不少代码呢？
 */
@Component
public abstract class Parent {
	private String name;
}
