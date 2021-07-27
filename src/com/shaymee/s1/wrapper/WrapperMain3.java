package com.shaymee.s1.wrapper;

public class WrapperMain3 {
// 하나씩 꺼내와서 숫자로 바꾼담에 곱하기를 해야함
	public static void main(String[] args) {
		String jumin = "";


//2. 합계를 11로 나눠서 나머지를 구하기
//3. 11에서 나머지를 빼기
//3_1. 11에서 나머지를 뺐을 때 두자리인 경우	
//4. 3번에서 나온 결과를 다시 10으로 나눠서 그 나머지를 구하기
//	 나머지 숫자랑 검증번호랑 같으면 올바른 번호
		
		String num1 = jumin.substring(0, 6); // substring()에서 beginIndex는 이상, fromIndex는 미만. 0<=x<6
		String num2 = jumin.substring(7, 14);
		String jumin2 = num1+num2; // 
		String[] strings = jumin2.split(""); // split으로 숫자 하나하나를 문자열배열로 만듦
		
		int[] a = new int[13]; // int배열 선언(크기는 주민번호처럼 13개)

		for(int i=0;i<13;i++) {   // int배열에 String배열을 하나하나 primitive타입으로 변환한 값 대입
			a[i]=Integer.parseInt(strings[i]);						
		}
		
		int[] b = new int[12]; // 주민번호 마지막숫자를 뺀 int배열 생성
		
		for(int i=0;i<12;i++) { // 공식대로 계산 
			if(i<=7) { 
				b[i]=a[i]*(i+2);
			} else if(i>7) {
				b[i]=a[i]*(i-6);
			}
		}
		
		int sum =0;
		
		for(int i=0;i<12;i++) { // 계산된 값들 합계 구하는 과정
			sum = sum+b[i]; 
		}
		
		int rest = sum%11; 
		
		int result = (11-rest)%10;
		
		if(result == a[12]) { // 계산한 결과를 주민번호 마지막값과 비교
			System.out.println("올바른 주민등록번호");
		} else {
			System.out.println("잘못된 주민등록번호");
		}

	}

}
