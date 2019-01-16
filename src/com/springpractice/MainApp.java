package com.springpractice;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		Message msg1 = (Message) context.getBean("message");
		
		msg1.getMessage();
	
		context.registerShutdownHook();//this only works with singleton scope beans
	}

}
