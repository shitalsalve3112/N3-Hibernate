package org.tnsif.client;

import org.tnsif.service.BookService;
import org.tnsif.service.BookServiceImpl;


import org.tnsif.service.BookService;
import org.tnsif.service.BookServiceImpl;

public class Client {

	public static void main(String[] args) {
		BookService service=new BookServiceImpl();
		
		//To return total number of books
			System.out.println("Total no. of books : "+service.getBookCount());
		//To return all the books
			System.out.println("All book : "+service.getAll());
		//To return specific book 
			System.out.println("Book with Specific id : "+service.getBookById(3));
		//To return price range between 300 to 500
			System.out.println("Price range between 300 to 500 : "+service.getPrice(300f,500f));
		//To return Author name
			System.out.println("Book with specific author name : "+service.getBooksAuthor("YK"));
	}
}