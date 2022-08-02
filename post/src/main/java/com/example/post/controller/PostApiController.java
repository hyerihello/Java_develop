package com.example.post.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.post.dto.PostRequestDto;

@RestController
@RequestMapping("/api")
public class PostApiController {
	
	@PostMapping("/post")
	
	
//	public void post(@RequestBody Map<String, Object> requestData) {
//		
//		requestData.entrySet().forEach( t -> {
//			System.out.println("key : " + t.getKey());
//			System.out.println("value : " + t.getValue());
//		});
		
//		requestData.forEach((key,value) -> {
//			System.out.println(key);
//			System.out.println(value);
//		});
	
	// DTO
	public void post(@RequestBody PostRequestDto requestData) {
		System.out.println(requestData.toString());
		System.out.println("\n");
		System.out.println(requestData);
	}

}
