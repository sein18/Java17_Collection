package com.collection.silsub1.model.vo;

public class Book {
	private int bNo;
	private int category;
	private String title;
	private String author;
	
	public Book() { }

	public Book( int category, String title, String author) {
		this.category = category;
		this.title = title;
		this.author = author;
	}

	public int getbNo() {
		return bNo;
	}

	public void setbNo(int bNo) {
		this.bNo = bNo;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
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

	@Override
	public String toString() {
		String str = "";
		if (category == 1) {
			str = "�ι�";
		} else if (category == 2) {
			str = "�ڿ�����";
		} else if (category == 3) {
			str = "�Ƿ�";
		} else if (category == 4) {
			str = "��Ÿ";
		}

		return "������ȣ: " + bNo + " �з�: " + str + " ����: " + title + " ����: " + author;
	}

 
	
	
	
}
