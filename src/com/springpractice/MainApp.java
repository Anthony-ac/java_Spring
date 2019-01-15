package com.springpractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld msg1 = (HelloWorld) context.getBean("helloWorld");
		
		msg1.setMessage("This is Message 1");
		msg1.getMessage();
	
		context.registerShutdownHook();//this only works with singleton scope beans
	}

}
