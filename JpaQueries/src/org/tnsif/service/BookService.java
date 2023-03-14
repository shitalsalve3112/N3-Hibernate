package org.tnsif.service;


import java.util.List;

import org.tnsif.entity.Book;

public interface BookService {

	//abstractv method
	List<Book>getAll();
	List<Book>getBooksAuthor(String author);
	List<Book>getPrice(Float low,Float high);
	Book getBookById(Integer id);
	Long getBookCount();
}