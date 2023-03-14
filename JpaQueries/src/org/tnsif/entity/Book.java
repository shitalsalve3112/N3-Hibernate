package org.tnsif.entity;


import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;
//program to demonstrate on jpa queries 
@Entity
@Table(name="Book")
public class Book implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String title;
	private String author;
	private Float price;
	
	//getters and setters
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	
	//default Constructor
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Parameterized constructor
	public Book(Integer id, String title, String author, Float price) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	//To string
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	
	
	
	

}