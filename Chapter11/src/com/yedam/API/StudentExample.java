package com.yedam.API;

import java.util.HashMap;

public class StudentExample {

	public static void main(String[] args) {
		// Student키로 총점을 저장하는 hashMap객체 생성
		HashMap<Student, String> hashMap = new HashMap<Student, String>();

		// new Student("1")의 점수 95를 저장
		hashMap.put(new Student("1"), "95");

		// new Student("1")로 점수를 읽어옴
		String score = hashMap.get(new Student("1"));
		System.out.println("1번 학생의 총점 : " + score);

		HashMap<Student, String> hashMap03 = new HashMap<Student, String>();

		hashMap03.put(new Student("또치"), "또치쓰");
		String str2 = hashMap03.get(new Student("또치"));

		System.out.println(str2);
		
		Object obj = new Object();
		Object obj2 = new Object();
		
		System.out.println(obj.toString());//toString 생략해도 무관
		System.out.println(obj2.toString());
		
		SmartPhone sp = new SmartPhone("apple",100,"iphone");
		System.out.println(sp.toString());
	}

}