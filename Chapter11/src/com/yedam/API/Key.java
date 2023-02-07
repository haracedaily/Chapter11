package com.yedam.API;

public class Key {
	public int key;
	
	public Key(int key) {
		this.key=key;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key compare = (Key)obj;
			if(this.key==compare.key) {
				return true;
			}
		}
		return false;
	}

	//해시코드는 int 즉 해시코드는 정수의 형태이다.
	@Override
	public int hashCode() {
		//equals랑 비슷한 개념으로, 해시코드는 가진 값이 같으면 같다고 재정의
		//데이터가 같으면, 같은 해시코드를 가질 수 있도록
		//재정의
		return key;
	}
	
	
	
}
