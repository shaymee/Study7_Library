package com.shaymee.s1.object;

public class Test {

	int num1 = 1;
	int num2 = 2;
	
	@Override
	public boolean equals(Object obj) {
		//밖에서 overriding 하는데 멤버변수끼리 서로 똑같은지 비교해주는것
		//test의 num1과 test2의 num1이 같고
		//test의 num2와 test2의 num2가 같게 overridding
		// 그래서 메인메소드에서 test(equals(test2)) --> 이걸 true가 되도록
		return false;

	}

	
	
	
}
