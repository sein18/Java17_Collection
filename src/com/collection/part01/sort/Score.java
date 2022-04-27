package com.collection.part01.sort;

import java.util.Objects;

public class Score implements Comparable{
	private String name;
	private int score;
	
	public Score() { }
	public Score(String name, int score) {
	 	this.name = name;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, score);
	}
	
	@Override
	public boolean equals(Object obj){
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Score other = (Score) obj;
		return Objects.equals(name, other.name) && score == other.score;
	}
	
	@Override
	public String toString() {
		return "Score [name = " + name + ", score = " + score + "]";
	}
	
	@Override
	public int compareTo(Object o) {
		//name �������� �������� �⺻ ����
		String othername = ((Score)o).getName(); 
		return -name.compareTo(othername);
		//���������������� ����
		//"��".compareTo("��") ==> compareTo�� ���:���
		//						 ���������� ���� return �ؾ� �ϴ� ��: �ٲ�� �ϴϱ� ��� ����
	}
	
	
	
	
	
	
	
	
}
