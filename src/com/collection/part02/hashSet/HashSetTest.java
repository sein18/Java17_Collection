package com.collection.part02.hashSet;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	public void testHashSet() {
		// HashSet
		HashSet hset = new HashSet();

		hset.add("java");
		hset.add(123);
		hset.add(45.67);
		hset.add(new Date());

		System.out.println("hset: " + hset);
		
		hset.add("java");
		hset.add(123);
		System.out.println("hset: " + hset);
		System.out.println("����� ��ü��: " + hset.size());
		
		///
		//1. toArray()
		Object arr[] = hset.toArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + " : " + arr[i]);
		}
		
		
		//2. Iterator()
		Iterator iter = hset.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
		/////
		//hset.remove("java");
		hset.clear();
		System.out.println(hset);
		
		
		hset.add(new Score("��â��", 100, 48));
		hset.add(new Score("������", 85, 87));
		hset.add(new Score("������", 72, 99));
		hset.add(new Score("�ֽ�ȣ", 80, 82));

		System.out.println("hset: " + hset);
		System.out.println("����: " + hset.size());

		hset.add(new Score("��â��", 100, 48));
		System.out.println("�߰� �� hset: " + hset);
		System.out.println("�߰� �� ����: " + hset.size());

		
		
		
		
		
		
		
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
