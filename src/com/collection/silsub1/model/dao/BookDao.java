package com.collection.silsub1.model.dao;

import java.util.ArrayList;

import com.collection.silsub1.model.comparator.AscCategory;
import com.collection.silsub1.model.vo.Book;

public class BookDao {
	private ArrayList<Book> bookList;

	public BookDao() {
		bookList = new ArrayList<Book>();
	}

	public BookDao(ArrayList<Book> list) {
		bookList = list;
	}

	//마지막 도서 번호 리턴
	public int getLastBookNo() {
		return bookList.get(bookList.size() - 1).getbNo();
	}
	//새 도서 추기
	public void addBook(Book book) {
		bookList.add(book);
	}
	
	public int deleteBook(int no) {
		for(int i=0;i<bookList.size();i++) {
			if(bookList.get(i).getbNo()==no) {
				bookList.remove(i);
				return 1;
			}
		}
		return 0;
	}

	public int searchBook(String title) {
		for(int i=0;i<bookList.size();i++) {
			if(bookList.get(i).getTitle().contains(title)) {
				return i;
			}
		}
		return -1;
	}
	//해당 인덱스 값을 이용한 book 객체 리턴
	public Book selectBook(int index) { 
		return bookList.get(index);
	}
	//전체 출력
	public ArrayList<Book> selectAll()  {
		
		return bookList;
	}
	
	public ArrayList<Book> sortedBookList() {
		ArrayList<Book> cList = new ArrayList<Book>();
		for(int i=0;i<bookList.size();i++) {
			cList.add(bookList.get(i));
		}
		cList.sort(new AscCategory());
		return cList;
	}
}
