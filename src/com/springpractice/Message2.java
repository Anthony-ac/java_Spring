package com.springpractice;

public class Message2 {
	
	public String message, message2;
	
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void getMessage() {
		System.out.println("The Message is: " + message);
	}
	
	public void setMessage2(String message2) {
		this.message2 = message2;
	}
	
	public void getMessage2() {
		System.out.println("The Message is: " + message2);
	}
	
	public void init() {
		System.out.println("Initiatiating bean");
	}
	
	public void destroy() {
		System.out.println("Destroying bean");
	}

}
