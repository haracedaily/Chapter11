package com.yedam.API;

public class SystemExample {

	public static void main(String[] args) {
		//System클래스
		//강제 종료 : system.exit();
		
//		for(int i=0; i<=10;i++) {
//			System.out.println(i);
//			if(i==5) {
//				System.exit(0);//강제종료<<사용x 강제로 까야할때 아니면..
//			}
//		}
//		System.out.println("프로그램 종료");
	
	
	//현재 시간 읽기
		long time = System.nanoTime();
		
		int sum = 0;
		
		for(int i =0;i<=1000000;i++) {
			sum+=1;
		}
		long time2=System.nanoTime();
		System.out.println(time);
		System.out.println(time2);
		System.out.println("1~1000000의 합 : "+sum);
		System.out.println("소요 시간 : "+(time2-time)+" 나노 초 소요");
		
		//현재 시간 -> 중복된 값을 가져오지 않을 수 있다.
		//즉, 시간을 데이터로 만든다면 절대 중복값이 나오지 x
		
		System.out.println(System.currentTimeMillis());
		
	}

}
