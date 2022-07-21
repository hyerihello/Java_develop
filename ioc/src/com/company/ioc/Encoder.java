package com.company.ioc;



public class Encoder {
	
	
	private IEncoder iEncoder;
	
	// 간단히 설정된 Encoder
	//생성자 
//	public Encoder() {
//		//this.iEncoder = new Base64Encoder();	
//		this.iEncoder = new UrlEncoder();	
//	}

	public Encoder(IEncoder iEncoder) {
	//this.iEncoder = new Base64Encoder();	
	// this.iEncoder = new UrlEncoder();
		this.iEncoder = iEncoder;
	}

	
	public String encode(String message) {
		return iEncoder.encode(message);
		
	}
}
