package com.shaymee.s1.string.ex1;

import java.util.Scanner;

public class WeatherInfo {

	private String info;
	private StringBuffer sb;	
	
	public WeatherInfo() { // 생성자
		sb = new StringBuffer();
		sb.append("seoul, 37, 80, 맑음, ");
		sb.append("busan, 35, 70, 흐림, ");
		sb.append("daegu, 40, 60, 지옥, ");
		sb.append("jeju, 33, 55, 비,");
	}
	// 네개의 DTO를 만들어서 배열에다가 하나씩 하나씩 집어넣서 리턴하는거
	
	
	public WeatherDTO [] makeWeather() { // split(), trim()
		//StringBuffer에 있는 data를 String으로 변환
		
		info = sb.toString();		
		//자르는 과정(파싱, parsing, 하나의 문자열을 여러개로 자르는 작업)
		String[] strings = info.split(",");
		WeatherDTO [] weathers = new WeatherDTO[strings.length/4];
//		WeatherDTO wD = new WeatherDTO();
		
		for(int i=0;i<strings.length;i++) {
			WeatherDTO weatherDTO = new WeatherDTO();				
			weatherDTO.setCityName(strings[i].trim());
			weatherDTO.setTemp(strings[++i].trim());
			weatherDTO.setHumid(strings[++i].trim());
			weatherDTO.setCond(strings[++i].trim());			
			
			weathers[i/4]=weatherDTO;		
	
		}

		return weathers;
	}
	
	
	public WeatherDTO searchWeather(WeatherDTO[] weathers) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 도시명 입력");
		String cityName = sc.next();
		
		WeatherDTO weatherDTO = null;		
		for(int i=0;i<weathers.length;i++) {
			if(weathers[i].getCityName().equals(cityName)) {
				weatherDTO = weathers[i];
				break;
			}
		}
		
		return weatherDTO;
		
		
		
//		WeatherInfo wi = new WeatherInfo();
//		WeatherDTO[] weathers =	wi.makeWeather();
//		
//		for(int i=0;i<weathers.length;i++){
//			boolean check = weathers[i].getCityName().equals(input);
//			System.out.println(check);
//			if(check) {
//				return weathers[i];

				
				
//				System.out.println("지역명\t 기온\t 습도\t 상태");
//				System.out.println("=================================");
//				System.out.print(weathers[i].getCityName()+"\t");
//				System.out.print(weathers[i].getTemp()+"\t");
//				System.out.print(weathers[i].getHumid()+"\t");
//				System.out.println(weathers[i].getCond());
//				System.out.println("---------------------------------");
		}
	}
			
	


//Scanner sc = new Scanner(System.in);
//System.out.println("지역수 입력");
//int num = sc.nextInt();
//for(int i=0;i<num;i++) {
//	System.out.println("지역명 입력");
//	String city = sc.next();
//	sb.append(city+",");
//	System.out.println("기온 입력");
//	String temp = sc.next();
//	sb.append(temp+",");
//	System.out.println("습도 입력");
//	String humid = sc.next();
//	sb.append(humid+",");
//	System.out.println("상태 입력");
//	String cond = sc.next();
//	sb.append(cond+",");
//	}

//sb.append("Seoul, 37, 80, 맑음,"); // 요 한줄이 DTO정보 하나
//sb.append("Daegu, 43, 90, 지옥,");
//sb.append)("Busan, -32, 10, 눈,");
//sb.append("Jeju, 3, 40, 비");	

