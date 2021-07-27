package com.shaymee.s1.wrapper;

import java.util.Scanner;

public class WrapperMain2 {

	public static void main(String[] args) {
		// 스캐너로 문자열의 주민번호 입력 받음 991224-1234567
		// 이 사람이 몇살인지 출력
		// 3-5월생 : 봄에 태어났다
		// 6-8월생 : 여름
		// 9-11월생 : 가을
		// 12-2월생 : 겨울
		String num = "931224-1234567";
		
		String year = num.substring(0, 2); // 선생님은 substring을 활용. 이게 훨씬 낫다.
		int y = Integer.parseInt(year);
		y = 1900+y;
		int age = 2021-y+1;
		System.out.println(age+"살");
		
		String m = num.substring(2, 4);
		int month = Integer.parseInt(m);
		System.out.println(month+"월");
		
		if(month>=3 && month<=5) {
			System.out.println("봄");
		} else if(month>=6 && month<=8) {
			System.out.println("여름");
		} else if(month>=9 && month<=11) {
			System.out.println("가을");
		} else if (month == 12 || month == 1 || month == 2){
			System.out.println("겨울");
		} else {
			System.out.println("오입력");
		}
		
		

		
		
		

	}

}

//Scanner sc = new Scanner(System.in);
//System.out.println("주민등록번호 입력");
//String number = sc.next();
//String[] numbers = number.split("-");
//String number1 = numbers[0];
//String number2 = numbers[1];
//
//int num = Integer.parseInt(number1); // 주민번호 앞자리
//int num2 = Integer.parseInt(number2); // 주민번호 뒷자리		
//
//int num3 = num-(num/10000)*10000; // 생월 정보
//
//if(num3/100 == 3 || num3/100 == 4 || num3/100 == 5) {
//	System.out.print("따뜻한 봄에 태어난 ");
//} else if(num3/100 == 6 || num3/100 == 7 || num3/100 == 8) {
//	System.out.print("뜨거운 여름에 태어난 ");
//} else if(num3/100 == 9 || num3/10 == 10 || num3/100 == 11) {
//	System.out.print("시원한 가을에 태어난 ");
//} else if(num3/100 == 12 || num3/100 == 1 || num3/100 == 2) {
//	System.out.print("추운 겨울에 태어난 ");
//} else {
//	System.out.println(" ㅡㅡ ");
//}
//
//int num4 = num2/1000000; // 성별 및 세대 정보
//int num5 = num/10000; // 생년 정보
//
//if(num4 == 1 || num4 == 2) {
//	if(num4 == 1) {
//		System.out.println("19"+num5+"년생 남자");
//	} else if(num4 == 2) {
//		System.out.println("19"+num5+"년생 여자");
//	}
//	
//} else if(num4 ==3 || num4 ==4) {
//	if(num4 ==3) {
//		System.out.println("20"+num5+"년생 남자");
//	} else if(num4 == 4) {
//		System.out.println("20"+num5+"년생 여자");
//	}
//}
