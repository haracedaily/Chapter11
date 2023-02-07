package com.yedam.API;

public class Student {
	private String studentNum;
	
	public Student(String studentNum) {
		this.studentNum=studentNum;
	}
	
	public String getStudentNum() {
		return studentNum;
	}

	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}//hashCode는 정수로 이루어졌고, String은 데이터 값이 같으면 같다는 성질을 이용
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student=(Student)obj;
			if(studentNum==student.getStudentNum()) {
	//stdNum.equals(std.stdNum))으로 equals override인데 equals써도 가능
				return true;
			}
		}
		return false;
	}
	
	
	
}
