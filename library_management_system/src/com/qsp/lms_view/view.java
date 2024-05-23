package com.qsp.lms_view;

import java.util.Scanner;

import com.qsp.lms_controller.controller;
import com.qsp.lms_model.book;
import com.qsp.lms_model.library;

public class view {
	static private library Library = new library();

	public static library getLibrary() {
		return Library;
	}

	public static void setLibrary(library library) {
		Library = library;
	}

	static Scanner myInput = new Scanner(System.in);
	static controller Controller = new controller();
	static {
		System.out.println("Welcome to LMS");
		// using variable libraryName to store inputs
		// it takes more space
		System.out.print("Enter Library Name : ");
		String libraryName = myInput.nextLine();
		Library.setLibraryName(libraryName);
		// directly using input in setter method to utilize space
		System.out.print("Enter Library Address : ");
		Library.setLibraryAddress(myInput.nextLine());
		// directly using input in setter method to utilize space
		System.out.print("Enter a pincode : ");
		Library.setPincode(myInput.nextInt());
		myInput.nextLine();
	}

	public static void main(String[] args) {

		do {
			System.out.println("Select option to perform : ");
			System.out.println("1.Add book\n2.Get book\n3.Update book\n4.Remove book\n0.Exit");
			System.out.print("Enter Digit respective to desired option : ");

			byte userChoice = myInput.nextByte();
			myInput.nextLine();

			switch (userChoice) {
			case 1:
				book Book = new book();
				System.out.print("Enter book name : ");
				Book.setBookName(myInput.nextLine());
				System.out.println("Enter Author name : ");
				Book.setBookAuthor(myInput.nextLine());
				System.out.println("Enter book price : ");
				Book.setBookPrice(myInput.nextDouble());
				myInput.nextLine();
				Controller.addBook(Book);
				System.out.println("Book Successfully Added..");
				break;
			case 2:
				System.out.println("Enter book name you're looking for : ");
				book fetchBook = Controller.getBook(myInput.nextLine());
				if (fetchBook != null) {
					System.out.println("Book is available");
					System.out.println("Book details : " + fetchBook);
				} else {
					System.out.println("Book is not available");
				}
				break;
			case 3:
				System.out.println("Enter book name you want to update : ");
				book updateBook = Controller.updateBook(myInput.nextLine());
				if (updateBook != null) {
					System.out.println("What to update ? ");
					System.out.println("1.Update Book Name\n2.Update Author Name\n3.Update Book Price");
					System.out.print("Enter Digit respective to desired option : ");
					byte updateChoice = myInput.nextByte();
					myInput.nextLine();
					switch (updateChoice) {
					case 1:
						System.out.println("Enter new name to book : ");
						updateBook.setBookName(myInput.nextLine());
						System.out.println("Name updated successfully");
						break;
					case 2:
						System.out.println("Enter new author name : ");
						updateBook.setBookAuthor(myInput.nextLine());
						System.out.println("Author name updated successfully");
						break;
					case 3:
						System.out.println("Enter new book price : ");
						updateBook.setBookPrice(myInput.nextDouble());
						myInput.nextLine();
						System.out.println("Book price updated successfully");
						break;
					default:
						System.out.println("Book not found to perform updation!!!");
						break;
					}

				} else {
					System.out.println("Book not found");
				}
				break;
			case 4:
				System.out.println("Enter book name you want to remove : ");
				boolean removeBook = Controller.remove(myInput.nextLine());
				if (removeBook == true) {
					System.out.println("book removed successfully");
				} else {
					System.out.println("Error! 404 book not found..");
				}

				break;
			case 0:
				myInput.close();
				System.out.println("-----Exited-----");
				System.exit(0);
				break;

			default:
				System.out.println("Invalid Selection");
				break;
			}

		} while (true);

	}

}
