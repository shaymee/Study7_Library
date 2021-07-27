package com.shaymee.s1.string.ex1;

import java.util.Scanner;

public class WeatherController {
	
	private WeatherInfo weatherInfo;
	private WeatherShow ws;
	private WeatherDTO wD;
	
	
	Scanner sc = new Scanner(System.in);


	public WeatherController() {				
		weatherInfo = new WeatherInfo();
		ws = new WeatherShow();
	}

	
	public void start() {				
		System.out.println("=== Start ===");

		WeatherDTO[] weathers = weatherInfo.makeWeather();
		
		boolean flag = true;
		
		while(flag) {			
			System.out.println("1. 전체날씨정보출력");
			System.out.println("2. 지역검색정보출력");
			System.out.println("3. 지역 정보 추가");
			System.out.println("4. 프로그램 종료");
			int select = sc.nextInt();
		
			if(select==1) { //전체날씨정보 출력
				
				this.ws.show(weathers);

			} else if(select==2) {				
				WeatherDTO weatherDTO = this.weatherInfo.searchWeather(weathers);
				if(weatherDTO != null) {
					this.ws.show(weatherDTO);				
				} else {
					this.ws.show("== 해당 정보 없음 ==");
				}
			} else if(select==3) {
						
				
				
				
				
				
				
				
			} else if(select==4) {
				flag = false;

			}
			
		}
		

		System.out.println("=== Finish ===");
	}

}
