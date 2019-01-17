package com.springpractice;

public class Library {

	private Books book;
	
	public void setBook(Books book) {
		System.out.println("setting the book");
		this.book = book;
	}
	
	public Books getBook() {
		return book;
		}
	
	public void startReading() {
		book.read();
	}
	
	public void init() {
		System.out.println("Initiatiating bean");
	}
	
	public void destroy() {
		System.out.println("Destroying bean");
	}
}
