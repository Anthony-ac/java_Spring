package com.springpractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld msg1 = (HelloWorld) context.getBean("helloWorld");
		msg1.getMessage();
	}

}
