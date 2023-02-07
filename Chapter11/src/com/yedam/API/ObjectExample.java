package com.yedam.API;

import java.util.HashMap;

public class ObjectExample {

	public static void main(String[] args) {
		Member member = new Member("123","111");
		Member mem1 = new Member("234","222");
		Member member2 = new Member("123","222");
		Member member3 = new Member("321","111");
		System.out.println(member.equals(member2));
		System.out.println(member.equals(mem1));
		System.out.println(member.equals(member3));
		
		//데이터를 저장 -> 데이터를 세트로 저장
		//데이터를 찾을 Key를 가지고 hashMap에 접근하면
		//Key에 매칭되어 있는 데이터를 가지고 나오는 형태
		HashMap<Key, String> hashMap = new HashMap<>();
		
		//서로 다름
//		Key a = new Key(1); -> new Key(1);
//		Key b = new Key(1); -> new Key(1);
		
		
		//근데 같은 해시코드를 가지려면 객체명을 정해주는게 편하지 ㅇ낳나..? 뭐지
		//key값이 1을 가지는 Key 인스턴스를 삽입하면 "홍길동"이 도출되게하라
		//===>변경; 이게 맞는듯. 해당하는 객체를 기입하면 "홍길동"이 도출되게 하라
		//여기서 홍길동이 도출되지 않은 이유는
		//new Key(1) -> 100번지
		hashMap.put(new Key(1), "홍길동");
		//new Key(1) -> 200번지
		String value = hashMap.get(new Key(1));
		//그렇다면?
		//아까 override한 equal과 hashCode를 사용해서 구한다.
		//이게 가능한 이유;
		//equal의 비교구문을 key의 값으로 줌<
		//hashCode로 나오는 값을 key의 값만 돌려줌<<
		//즉 다른 객체로 생성한다해도 key값이 같으면 ==hashcode + ==equal =>동등 객체
		//이 기전을 이용하여 아까 저장한 내용을 도출하게 됨
		
		//그렇다면 여기서 정리하고자 하는 내용은
		//객체는 hashCode와 equal 비교구문이 같으면 같다고 본다.//이게 맞나? 일단 keep
		//왜 의문이 드냐?<- 비교구문을 별도 이용하지 않았음에도 true값이 주어진다는건
		//hashMap 구문 안에 비교구문이 있다는거 같은데... 못 찾음//비교구문이 있는게아니라 hashCode와 equal로 데이터를 저장 불러옴!<<<
		//즉 저장할때 애초에 hashCode로 저장이 되고 equal로 비교한다..?
		
		System.out.println(value);
		
		HashMap<Member, String> hashMap02 = new HashMap<>();
		
		hashMap02.put(new Member("열쇠"),"김또치");
		
		String str = hashMap02.get(new Member("열쇠"));
		System.out.println(str);
	}

}
