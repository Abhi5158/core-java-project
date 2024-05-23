package com.qsp.lms_controller;

import java.util.ArrayList;
import java.util.List;

import com.qsp.lms_model.book;
import com.qsp.lms_model.library;
import com.qsp.lms_view.view;

public class controller {
	private static library Library = view.getLibrary();
	static List<book> books = Library.getBooks();

	public void addBook(book Book) {

		if (books == null) {
			books = new ArrayList<>();
		}
		books.add(Book);
		Library.setBooks(books);
	}

	public book getBook(String bookName) {

		if (books != null) {
			for (book book : books) {
				if (book.getBookName().equalsIgnoreCase(bookName)) {
					return book;
				}
			}
		}
		return null;
	}
	public boolean remove(String bookName) {
		if (books!=null) {
			for (book book : books) {
				if(book.getBookName().equalsIgnoreCase(bookName)) {
					books.remove(book);
					return true;
				}
			}
			
		}
		return false;
	}
	
	public book updateBook(String updateBook) {
		if (books!=null) {
			for (book book : books) {
				if (book.getBookName().equalsIgnoreCase(updateBook)) {
					return book;
					
				}
			}
			
		}
		return null;
	}
}
