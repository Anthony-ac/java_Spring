package com.springpractice;


public class HelloWorld{

	private String message;
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void getMessage() {
		System.out.println("The Message is: " + message);
	}
	
	public void init() {
		System.out.println("Initiatiating bean");
	}
	
	public void destroy() {
		System.out.println("Destroying bean");
	}
	
	}
