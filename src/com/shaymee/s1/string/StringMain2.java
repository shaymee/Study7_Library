package com.shaymee.s1.string;

public class StringMain2 {

	public static void main(String[] args) {
		
		String name = "Hello World";
//		String name = new String("Hello");  이 방식과 똑같음.
	
		char ch = name.charAt(1);
		System.out.println(ch);
//		System.out.println(name.charAt(0));
		
		name="991021-1234567";
		
		//남녀판별
		
		ch = name.charAt(7);
		if(ch == '1' || ch == '3' || ch =='5') { // 문자를 int타입으로 자동형변환 -> 아스키코드 활용하는 것도 방법 !
			System.out.println("남자");
		} else if(ch=='2' || ch == '4' || ch=='6'){
			System.out.println("여자");
		}

		ch = name.charAt(200);
		System.out.println(ch); // OutOfBounds
		
	}

}
