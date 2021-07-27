package com.shaymee.s1.string.ex1;

public class WeatherShow {

	WeatherInfo weatherInfo = new WeatherInfo();
	private WeatherDTO [] weathers;
	
	
	public void show(WeatherDTO[] weathers) { //1. 전체출력
		
		System.out.println("지역명\t 기온\t 습도\t 상태");
		System.out.println("=============================");
		for(int i=0;i<weathers.length;i++) {						
			System.out.print(weathers[i].getCityName()+"\t");
			System.out.print(weathers[i].getTemp()+"\t");
			System.out.print(weathers[i].getHumid()+"\t");
			System.out.println(weathers[i].getCond()+"\t");
			System.out.println("-----------------------------");		
		}
	}
	
	public void show(WeatherDTO weatherDTO) { //2. 검색출력 & overloading
		boolean check;
		check = weatherDTO == null;
		
		if(!check) {
		System.out.println("지역명\t기온\t습도\t상태 ");
		System.out.println("==============================");
		System.out.print(weatherDTO.getCityName()+"\t");
		System.out.print(weatherDTO.getTemp()+"\t");
		System.out.print(weatherDTO.getHumid()+"\t");
		System.out.println(weatherDTO.getCond());
		System.out.println("------------------------------");
		
		} else {
		System.out.println("== 해당 도시 정보 없음 ==");	
	
		}
	}	
	
	public void show(String message) {
		System.out.println(message);
	}
	
}

//WeatherDTO[] weathers =	weatherInfo.makeWeather();
//for(int i=0;i<weathers.length;i++){
//	boolean check = weathers[i].getCityName().equals(input);
//	System.out.println(check);
//	if(check) {
//		System.out.println("지역명\t 기온\t 습도\t 상태");
//		System.out.println("=================================");
//		System.out.print(weathers[i].getCityName()+"\t");
//		System.out.print(weathers[i].getTemp()+"\t");
//		System.out.print(weathers[i].getHumid()+"\t");
//		System.out.println(weathers[i].getCond());
//		System.out.println("---------------------------------");
//	}
//}
