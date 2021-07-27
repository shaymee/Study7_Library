package com.shaymee.s1.string;

public class StringMain1 {

	public static void main(String[] args) {
		System.out.println(String.CASE_INSENSITIVE_ORDER);
		
		//String클래스의 객체 생성
		String t1 = "test"; //이것도 객체 생성(원랜 아니지만 String클래스를 워낙 많이 하니까 이것도 객체 생성이라고 보는 것)
		String t2 = new String("test"); //원랜 이렇게 만듦
		
		System.out.println(t1.toString());
		System.out.println(t2.toString());

		
		
		Test test = new Test();
		System.out.println(test);
		System.out.println(test.toString());
		
		System.out.println(t1==t2); //false로 나옴. 
		
	}

}
