package com.yedam.API;

public class Member {
	
	//equals 재정의(오버라이딩)
	//equals => 논리적으로 동등한 객체임을 확인
	//확인 방법 : 객체가 가진 데이터가 동등->논리적으로 동등
	
	//필드
	public String id;
	public String pw;
	//생성자
	public Member(String id) {
		this.id=id;
	}
	public Member(String id,String pw) {
		this.id=id;
		this.pw=pw;
	}
	//메소드
	@Override
	public boolean equals(Object obj) {
		//논리적으로 동등하다
		//Casting
		//String a="a"; String b ="a";
		//a==b => true
		if(obj instanceof Member) {
			//obj가 member타입인지 확인.
			//member타입으로 강제 타입 변환.
			Member member = (Member) obj;
			
			
		//id m1 -> m2 비교-->>매개변수의 id가 아니라 equal을 사용한 객체의 id
			//이 구문에서 id를 넣는 이유는 객체의 변수 중 id를 비교하기 위해서
			//즉 이 오버라이딩 된 equal을 별도 override없이 사용하기 위해선
			//member.id.equal(member.id)로 사용하면 동일한 로직으로 이루어진다.
		if(id.equals(member.id)) {
			return true;
		}
	}
	return false;
		
	}
	@Override
	public int hashCode() {
		
		//String 문자열의 데이터 같으면 주소 값이 같다.
		//String str = "A" =>300번지
		//String str2 = "A" =>300번지
		
		//이 특징을 이용해 return에 이용 how?
		
		//id의 해시코드==>같은 String은 같은 Heap에 저장된 값을 사용한다.
		//즉, String으로 구성된 id의 값이 같으면 hashcode의 값은 동일하다.
		return id.hashCode();
	}
	
	
}
