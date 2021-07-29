package com.shaymee.s2.random;

import java.util.ArrayList;
import java.util.Random;

public class Password {
	
	//makePassword()
	//랜덤한 패스워드 생성
	//대문자, 소문자,숫자 조합
	//총8글자
	//a4bcD5P0
	//첫번째글자가 대,소문자,숫자 중 1개
	//두번째글자도 대,소문자,숫자 중 1개
	//1. 대문자, 소문자, 숫자로 쓸거냐를 랜덤하게 결정되게 해야함. hint) random.nextInt(3)+1; 
	//2. 결정된 글자가 나와야함								hint)아스키코드(숫자를가지고 문자를 가져옴) 
	//최종적으로는 문자열을 만듦.
	
	Random random = new Random();
	ArrayList<Character> ar = new ArrayList<>();
	
	
	public String makePassword() {
		String pw = "";
		
		for(int i=0;i<8;i++) {
			int num = random.nextInt(123);
			boolean x = num>47 && num<58;
			boolean y = num>64 && num<91;
			boolean z = num>96 && num<123;
			
			if(x || y || z) {
				ar.add((char)num);
				pw = pw+ar.get(i);
			} else {
				i--;
			}
		}
		
		return pw;
	}

}
