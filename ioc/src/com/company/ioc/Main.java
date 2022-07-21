package com.company.ioc;

public class Main {

	public static void main(String[] args) {
		String url = "www.naver.com/books/it?page=10&size=20&name=spring-boot";
		
		// Base 64 encoding 
		//Base64Encoder encoder = new Base64Encoder();
		IEncoder encoder = new Base64Encoder();
		String result = encoder.encode(url);
		System.out.println("Base64 Encoder : " + result);
		
		// URL encoding
		// UrlEncoder urlencoder = new UrlEncoder();
		IEncoder urlencoder = new UrlEncoder();
		String Urlresult = urlencoder.encode(url);
		System.out.println("UrlEncoder : " + Urlresult);
		
		// 간단한 설정 Encoder 
		//Encoder encoder2 = new Encoder();
		//String result2 = encoder2.encode(url);
		//System.out.println("설정된 Encoder : " + result2);
		
		// DI - 주입 Encoder
		//Encoder encoder2 = new Encoder(new Base64Encoder());
		Encoder encoder2 = new Encoder(new UrlEncoder());
		String result2 = encoder2.encode(url);
		System.out.println("DI Encoder : " + result2);
		
		
		
	}

}
