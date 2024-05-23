package com.qsp.lms_model;

import java.util.List;

public class library {
	private String libraryName;
	private String libraryAddress;
	private int pincode;
	
	private List<book> books;  
	
	public List<book> getBooks() {
		return books;
	}
	public void setBooks(List<book> books) {
		this.books = books;
	}
	public String getLibraryName() {
		return libraryName;
	}
	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}
	public String getLibraryAddress() {
		return libraryAddress;
	}
	public void setLibraryAddress(String libraryAddress) {
		this.libraryAddress = libraryAddress;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

}
