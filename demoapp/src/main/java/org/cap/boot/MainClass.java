package org.cap.boot;

import org.cap.model.Student;

public class MainClass {

	public static void main(String[] args) {

		int[] myarr = { 12, 45, 67, 89, 23 };

		for (int n : myarr)
			System.out.println(n);

		SalesClass class1 = new SalesClass();
		class1.display();
		
		Student student = new Student();
		student.setStudentId(124);
		student.setFirstName("Tom");
		student.setLastName("Jerry");
		System.out.println(student);
		
		

	}

}