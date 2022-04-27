package com.collection.part01.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ScoreManager {

	public static void main(String[] args) {
		List list = new ArrayList();

		list.add(new Score("ÀÌÃ¢Áø", 99));
		list.add(new Score("±è½Â¿ì", 86));
		list.add(new Score("¿øÇöÁØ", 77));

		list.add(new Score("±èÁ¾È£", 66));
		list.add(new Score("ÃÖ½ÂÈ£", 88));
		list.add(new Score("¹Ú¼¼ÀÎ", 100));
		list.add(new Score("Á¶¹Î±Ô", 72));
		
//		System.out.println("list: " + list);
//		System.out.println(new Score());
//		Collections.sort(list);
//		System.out.println("sortList: " + list);
//		
		Collections.sort(list, new DescScore());
		System.out.println(list);
		 
	}
}
