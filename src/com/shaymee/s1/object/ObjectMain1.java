package com.shaymee.s1.object;

public class ObjectMain1 {

	public static void main(String[] args) {
		//객체생성 code
		//클래스명 참조변수명 = new 생성자호출();
		Object obj = new Object();
		
		//<멤버변수, 멤버메서드 호출> 
		//참조변수명.멤버메서드명([인자값]);
		//참조변수명.멤버변수;
		
		int a = obj.hashCode();
		int b = obj.hashCode();
		
		System.out.println(a);
		System.out.println(b);
		
		String s = obj.toString(); //참조변수 주소 
									//toString은 실제객체 주소를 찍어주는 메소드
		System.out.println(s); 
		
		System.out.println(obj); // obj는 실제 객체를 가리키는 주소
		
//		Object obj2 = new Object();
		
//		boolean t = obj.equals(obj2);
	//	System.out.println(t);
		
		Test test = new Test();
//		test.hashCode();
		
		System.out.println(test.hashCode());
		
//		Object obj3 = test; // 들어간다는 것은 test는 Object 타입이 맞다 라는 의미
		
		
		Test test2 = new Test();
		
	//	System.out.println(test == test2);
		System.out.println(test.num1 == test.num2);
	//	test2.num2=10; 이렇게 나오면 false가 나와야되고
	//  test.num2=2; 이렇게 나오면 true가 나와야되고
		System.out.println(test.equals(test2)); // 부모로부터 상속받은 메소드 // false
		
		

		
		
		
		
		
	}
	
	
	
}
