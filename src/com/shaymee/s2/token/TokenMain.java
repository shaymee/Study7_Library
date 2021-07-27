package com.shaymee.s2.token;

import java.util.StringTokenizer;

public class TokenMain {

	public static void main(String[] args) {
		
		String str = "seoul, 92, 80, 비";		
		
		//일단 해당 패키지에서 찾고 -> 그 후 java.lang 패키지를 찾아보는데 없으면 import로 어디 패키지인지 알려줘야 함.
		//원래는 java.util.StringTokenizer 이런 식으로 다 써줘야 함 but, 너무 번잡해짐.
		
		StringTokenizer st = new StringTokenizer(str, ","); // 쉼표를 만나거나 문자열의 끝을 만날 때까지 분리함
		
		//반복하는데 끝을 모를 때 => while 반복문 
		while(st.hasMoreTokens()) { // hasMoreTokens() => "잘라야 하는 토큰이 더 있나요?" == hasMoreElements()
			String s = st.nextToken()/*.trim()*/;
			System.out.println(s);
		} // hasMoreTokens()와 nextToken()는 쌍으로 사용하는 경우가 많음
		
		
		
		

	}

}
