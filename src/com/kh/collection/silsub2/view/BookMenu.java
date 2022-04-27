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
			System.out.println("***���� ���� ���α׷�***");
			System.out.println("1. �� ���� �߰�");
			System.out.println("2. �������� ���� �� ���");
			System.out.println("3. ���� ����");
			System.out.println("4. ���� �˻����");
			System.out.println("5. ��ü ���");
			System.out.println("6. ������");
			System.out.print("�޴� ��ȣ ����: ");
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
		System.out.print("���� ����: ");
		String title = sc.nextLine();
		System.out.print("���� �帣 (1:�ι� / 2:�ڿ����� / 3:�Ƿ� / 4:��Ÿ) : ");
		int category = sc.nextInt();
		sc.nextLine();
		System.out.print("���� ���� : ");
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
