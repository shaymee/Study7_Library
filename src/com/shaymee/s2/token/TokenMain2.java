package com.shaymee.s2.token;

import java.util.StringTokenizer;

public class TokenMain2 {

	public static void main(String[] args) {
		//나라별로 파싱		
		//모든 나라이름은 대문자로 출력

		String str = "Korea-USA-China*France*UK-canada-germany";
		str = str.replace("*", "-"); // char타입이든, String타입이든 상관X
		
		StringTokenizer st = new StringTokenizer(str); // 분리할 기준을 생성자에 미리 넣어놔도 되고, 아래 nextToken()에서 따로 지정해도 된다.
		
		while(st.hasMoreTokens()) {
			String st2 = st.nextToken("-").toUpperCase().trim(); // trim() 메서드로 공백 제거도 가능 
		//	st2 = st2.toUpperCase(); 이렇게 하든가 or 프린트할 때 하든가 그건 자유
			System.out.println(st2);
		}
				
		
	}

}
