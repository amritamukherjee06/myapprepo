package org.cap.boot;

import java.util.Arrays;
import java.util.List;

public class SalesClass {

	List<Integer> list = Arrays.asList(12, 34, 45, 23, 23, 12, 12, 4, 5, 1);

	public void display() {

		int sum =0;
		System.out.println("***********integer list*****************");
		for (int num:list) {
			
			sum+=num;
			System.out.println(num);
		}
			System.out.println(sum);
	}
	
	public void show() {
		System.out.println("Show Method");
	}

}