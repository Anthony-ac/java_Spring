package com.springpractice;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitMessage implements BeanPostProcessor{//will run below code after all beans are initiated
	public Object postProcessBeforeInitialization(Object bean, String beanName)
	throws BeansException{
		System.out.println("Before Initialization: " + beanName);
		return bean;//return the object so spring can continue its process
	}
	
	public Object postProcessAfterInitialization(Object bean, String beanName)
	throws BeansException{
		System.out.println("After Initialization: " + beanName);
		return bean;//return the object so spring can continue its process
	}
}
