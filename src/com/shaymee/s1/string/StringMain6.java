package com.shaymee.s1.string;

public class StringMain6 {

	public static void main(String[] args) {
		
		String weather = "서울-대구-대전-광주-부산-제주";
		
		String [] cities = weather.split("-");
		
		for(int i=0;i<cities.length;i++) {
			System.out.println(cities[i]);
		}

		weather = "32 89 45 67";
		String [] cities2 = weather.split(" ");
		
		for(int i=0;i<cities2.length;i++) {
			System.out.println(cities2[i]);
		}
		
		String name = "         Te st           ";
		name = name.trim();
		name = name.replace(" ", ""); //oldChar, newChar
		System.out.println(name.equals("Test"));
		
	}

}
