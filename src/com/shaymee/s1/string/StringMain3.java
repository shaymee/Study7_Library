package com.shaymee.s1.string;

public class StringMain3 {

	public static void main(String[] args) {
		String name = "Hello World oo";
//		int num = name.indexOf("lo", 0);
//		System.out.println(num);
		
		char ch = 'H';
		boolean check = true;
		int num = 0;
		int count = 0;
		
		while(check) {
		num = name.indexOf(ch, num);
		
		if(num>0) {
			num++;
			count++;
		} else {
			System.out.println("검색종료");
			break;
		}

		}
		
		System.out.println(ch+" 는 총 " +count+"개 있습니다");
		
		
//		name = ""; 
//		name = new String(); // length가 0
		

		
		

	}

}
