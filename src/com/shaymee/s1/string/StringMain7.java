package com.shaymee.s1.string;

public class StringMain7 {

	public static void main(String[] args) {
	
//		int num = 10; // --(변환)-->"10"
//		String newNum = String.valueOf(num); //클래스메서드는 객체를 만들지 않고도 바로 사용 가능(클래스변수도 마찬가지)
//		System.out.println(newNum);
	
		System.out.println("----------");

		String n1 = "abc";
		String n2 = "def";
		
		StringBuffer sb = new StringBuffer();
		sb.append(n1);
		sb.append(n2);
		sb.append(3);
		
		String str = sb.toString();    // toString 메서드를 활용해서 이런 식으로는 출력할 수 있다
		// 형변환은 부모-자식 관계일 경우만
		// 혹은 Primitive 타입 끼리만
		
		System.out.println(sb);
		System.out.println(str);
		
		
	}

}
