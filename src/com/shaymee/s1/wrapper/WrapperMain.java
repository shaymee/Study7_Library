package com.shaymee.s1.wrapper;

public class WrapperMain {

	public static void main(String[] args) {
		int num = 1; 
		String str = "1";
		
		Integer integer = num; // 들어가면 안되는데 들어감! ==> 이것이 Wrapper클래스다!
		
		System.out.println(Integer.BYTES); // 변수명이 대문자 --> final이 있는 상수, fields는 멤버변수
		System.out.println(Integer.MAX_VALUE); // 클래스변수 사용법: 클래스명.클래스변수명
		System.out.println(Integer.MIN_VALUE); // int로 나타낼수있는 가장 작은수
		System.out.println(Integer.SIZE); // size는 bit를 나타내네!
		
		String s = "10";
		System.out.println(10+s); // 20이 나오게 하려면 문자열을 숫자로 바꿔줘야되는데 이럴 때 필요한게 Wrapper class.
			
		s = " 1";
		num = Integer.parseInt(s.trim()); // String --> int타입(primitive type)
		System.out.println(num+100);
		
		int n1 = 10;
		Integer n2 = Integer.valueOf(n1); // int타입을 Integer타입으로 변경 (Boxing 작업)
		Double d = Double.valueOf(3.1); // double타입을 Double타입으로 Reference타입으로 바꿀 때
		
		n1 = n2.intValue(); // unboxing 작업
		
		n2 = n1; // 이런식으로도 되게끔 만들어놨음 ==> 오토 박싱(Auto boxing)
		
		n1 = n2; // ==> 오토 언박싱(Auto unboxing)
		
		double d1 = d;		
		n1 = (int)d1;
		
		
	}

}
