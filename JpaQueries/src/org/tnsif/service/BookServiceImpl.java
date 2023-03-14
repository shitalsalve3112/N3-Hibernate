package org.tnsif.service;


import java.util.List;

import org.tnsif.dao.BookDao;
import org.tnsif.dao.BookDaoImpl;
import org.tnsif.entity.Book;

public class BookServiceImpl implements BookService{
	
	private BookDao dao;
	
    //constructor
	public BookServiceImpl() {
		dao=new BookDaoImpl();
	}

	@Override
	public List<Book> getAll() {
		
		return dao.getAllBooks();
	}

	@Override
	public List<Book> getBooksAuthor(String author) {
		
		return dao.getBooks(author);
	}

	@Override
	public List<Book> getPrice(Float low, Float high) {
		return dao.getPriceERange(low, high);
	}

	@Override
	public Book getBookById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long getBookCount() {
		// TODO Auto-generated method stub
		return null;
	}

}