package com.example.server.model;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReqDto<T> {
	
	private Header header;
	private T body;
	
	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	public static class Header{
		private String responseCode;
	}
}
