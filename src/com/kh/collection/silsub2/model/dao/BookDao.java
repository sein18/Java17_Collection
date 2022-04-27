package com.kh.collection.silsub2.model.dao;

import java.util.ArrayList;
import java.util.HashMap;
import com.kh.collection.silsub2.model.vo.Book; 

public class BookDao {
	private HashMap<String, Book> bookMap = new HashMap<String, Book>();

	public BookDao() { 
		
	}

	public BookDao(HashMap<String, Book> bookMap) { 
		this.bookMap = bookMap;
	}

	public int getLastBookNo() {
		if (bookMap.size() == 0) {
			return 0;
		} else {
			return bookMap.size();
		}
	}

	public void addBook(Book book) {
		bookMap.put(null, book)
	}
	public Book deleteBook(String key) {
		 return null;
	}
	public String searchBook(String title) {
		 return null;
	}
	public Book selectBook(String key) {
		 return null;
	}
	public HashMap<String, Book> selectAll(){
		
		return null;
	}
	public ArrayList<Book> sortedBookList(){
		return null;
	}

}
