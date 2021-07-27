package com.shaymee.s1.string;

public class StringMain4 {

	public static void main(String[] args) {
		
		String n1 = "iu"; // toString이 자동으로 Override된 값이 나옴. 원래는 객체를 가리키는 주소가 나와야 함.
		String n2 = "iu";
		String n3 = new String("iu");
		String n4 = new String("iu");
		
		System.out.println(n1==n2); //예상외로 true
		System.out.println(n3==n4); //얜 false
		System.out.println(n1==n3); //false
		System.out.println(n2==n4); //false
		
		System.out.println("--------------------");
		
		System.out.println(n1.equals(n2)); //true. Object클래스에서 상속받아 equals()를 오버라이딩하여 실제 데이터값의 일치와 비교하게 됨
		System.out.println(n3.equals(n4)); //true. 앞으론 문자열 비교를 위해서 ==이 아니라 equals()를 쓰세요! (Primitive타입은 ==를 사용)
		System.out.println(n1.equals(n3)); //true
		System.out.println(n2.equals(n4)); //true
		
		
		
	}

}
