package com.qsp.lms_model;

public class book {
	private String bookName;
	private String bookAuthor;
	private double bookPrice;
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	@Override
	public String toString() {
		return "bookName=" + bookName + ", \nbookAuthor=" + bookAuthor + ", \nbookPrice=" + bookPrice + "";
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	

}
