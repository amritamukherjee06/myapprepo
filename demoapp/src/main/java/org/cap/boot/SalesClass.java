package org.cap.boot;

import java.util.Arrays;
import java.util.List;

public class SalesClass {

	List<Integer> list = Arrays.asList(12, 34, 45, 23, 23, 12, 12, 4, 5, 1);

	public void display() {

		System.out.println("***********integer list*****************");
		for (int i=0;i<list.size();i++)
			System.out.println(list.get(i));
	}
	
	public void show() {
		System.out.println("Show Method");
	}

}