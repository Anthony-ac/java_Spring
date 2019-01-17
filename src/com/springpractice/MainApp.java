package com.springpractice;



import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		Message msg1 = (Message) context.getBean("message");
		msg1.getMessage();
		
		Message2 msg2 = (Message2) context.getBean("message2");
		msg2.getMessage();
		msg2.getMessage2();	
		
		Library book1 = (Library) context.getBean("library");
		book1.startReading();
		
		Collections listCollections = (Collections) context.getBean("collections");
		listCollections.getList();
		listCollections.getSet();
		listCollections.getHashMap();
		
		context.registerShutdownHook();//this only works with singleton scope beans
	}

}
