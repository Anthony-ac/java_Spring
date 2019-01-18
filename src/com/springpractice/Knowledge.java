package com.springpractice;

public class Knowledge {
	TextBooks textbook;
	public Knowledge(TextBooks textbook) {
		System.out.println("You are in the Knowledge Constructor");
		this.textbook = textbook;
	}
	
	public void print() {
		textbook.msg();
	}
}
