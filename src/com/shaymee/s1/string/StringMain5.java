package com.shaymee.s1.string;

import java.util.Scanner;

public class StringMain5 {

	public static void main(String[] args) {
	
		String n1 = "Hello World";
		String n2 = n1.replace('l', 'z'); //n1에 있는 문자열이 바뀌는건 아님
		//oldChar는 가지고 있는 문자열의 문자 하나
		System.out.println(n1);
		System.out.println(n2);
		
		//charSequence는 문자열을 말함
		String n3 = n1.replace("He", "She");
		System.out.println(n3);
		
		String n4 = n1.substring(n1.indexOf("W"), 8); //마지막 인덱스 번호 '미만' 까지		
		System.out.println(n4);
		
		System.out.println("----------------------------");

		Scanner sc = new Scanner(System.in);
		//
		System.out.println("저장할 파일명 입력");
		//a.txt, iu.jpg, study.pdf, test.iu.gif, ....
		//입력받은 파일명을 분석해서 입력받은 파일이 image파일인지 아닌지 구분
		//이미지파일 형식 => jpg, gif, png
		String input = sc.next();	
		
		String[] files = {"jpg", "png", "gif", "svg"};		
		
		//1번:  .(닷)이 있는 인덱스번호 찾기	
		int idx = input.lastIndexOf(".");
		String etx = input.substring(idx+1);
		boolean check = false;
		
		for(int i=0;i<files.length;i++) {
			if(etx.equals(files[i])) {
				check = true;
				break;
			}
			
		}
		
		if(check) {
			System.out.println("이미지 파일");
		} else {
			System.out.println("이미지 파일이 아님");
		}
		
		System.out.println(etx);
		
		
		
	}

}
