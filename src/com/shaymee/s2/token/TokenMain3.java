package com.shaymee.s2.token;

import java.util.StringTokenizer;

public class TokenMain3 {

	public static void main(String[] args) {
		
		String str1 = "korea-usa-france"; // split()이 편함
		
		String[] s = str1.split("-");
		Nation [] nations = new Nation[s.length];
			for(int i=0;i<s.length;i++) {
				Nation n = new Nation();
				n.setName(s[i]);
				nations[i]=n;
			}
		
		for(int i=0;i<s.length;i++) {
			Nation n = new Nation();
			n.setName(s[i]);
		}
		
		StringTokenizer st = new StringTokenizer(str1, "-");
		
		while(st.hasMoreTokens()) {
			String name = st.nextToken();
			Nation n = new Nation();
			n.setName(name);
		}
		
		String str2 = "note10-100-iphone12-130-zflip-300"; // StringTokenizer가 편함

		//split
		String [] strs = str2.split("-");
		
		for(int i=0;i<strs.length;i++) {
			Phone phone = new Phone();
			phone.setName(strs[i]);
			phone.setPrice(strs[++i]);
		}
				
		StringTokenizer st2 = new StringTokenizer(str2, "-");
		
		while(st2.hasMoreTokens()) {
			Phone phone = new Phone();
			phone.setName(st.nextToken());
			phone.setPrice(st.nextToken());
		}
		
	}
// 하나의 데이터가 잘랐을 때 한 객체의 멤버변수로 들어간다면 split이 편함
	// 두개의 멤버변수로 들어간다면 tokenizer가 더 편함
	
}
