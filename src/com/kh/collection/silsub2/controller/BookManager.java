package com.kh.collection.silsub2.controller;

import java.util.HashMap;
import java.util.Scanner;

import com.kh.collection.silsub2.model.dao.BookDao;
import com.kh.collection.silsub2.model.vo.Book;

public class BookManager {
	private Scanner sc =new Scanner(System.in);
	private BookDao bd = new BookDao();
	
	public BookManager() { }
	
	public void addBook(Book book) {
		book.setbNo(Integer.toString(bd.getLastBookNo()+1));	
		bd.addBook(book);
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
	public HashMap<String,Book> selectAll(){
		return null;
	}
	public Book[] sortedBookList() {
		return null;
	}
	public void printBookList(Book[] br) {
		
	}
}
