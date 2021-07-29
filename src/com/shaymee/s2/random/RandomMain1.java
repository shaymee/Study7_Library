package com.shaymee.s2.random;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class RandomMain1 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hashMap = new HashMap<>();
		
		Lotto lotto = new Lotto();

		hashMap = lotto.makeLotto();
		
		for(int i=1;i<7;i++) {
			String count = i+"번";
			System.out.println(hashMap.get(count));
		}
		
		Password password = new Password();
		String pw = password.makePassword();
		System.out.println("가상비번:"+pw);
		
		
		
		
		
//		lotto.makeLotto2();
		
	}
}