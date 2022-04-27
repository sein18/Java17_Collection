package com.kh.collection.silsub2.view;

import java.util.Scanner;

import com.kh.collection.silsub2.controller.BookManager;
import com.kh.collection.silsub2.model.vo.Book;

public class BookMenu {
	private Scanner sc = new Scanner(System.in);
	private BookManager bm = new BookManager();

	public BookMenu() { }

	public void mainMenu() {
		while (true) {
			System.out.println("***도서 관리 프로그램***");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서정보 정렬 후 출력");
			System.out.println("3. 도서 삭제");
			System.out.println("4. 도서 검색출력");
			System.out.println("5. 전체 출력");
			System.out.println("6. 끝내기");
			System.out.print("메뉴 번호 선택: ");
			int num= sc.nextInt();
			sc.nextLine();
			switch(num) {
			case 1:
				bm.addBook(inputBook());
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				return ;
			}
		}
	}

	public Book inputBook() {
		System.out.print("도서 제목: ");
		String title = sc.nextLine();
		System.out.print("도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) : ");
		int category = sc.nextInt();
		sc.nextLine();
		System.out.print("도서 저자 : ");
		String author = sc.nextLine();
		return new Book(category, title, author);
	}

	public String inputBookNo() {
		return null;
	}

	public String inputBookTitle() {
		return null;
	}
}
