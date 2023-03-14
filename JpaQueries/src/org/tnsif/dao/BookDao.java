package org.tnsif.dao;

import java.util.List;

import org.tnsif.entity.Book;
//Interface
public interface BookDao {

	//abstract method
	List<Book>getAllBooks();
	List<Book>getBooks(String author);
	List<Book>getPriceERange(Float low,Float high);
	Book getBookById(Integer id);
	Long getBookCount();
	
	
}