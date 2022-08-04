package com.example.put;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.put.dto.PostRequestDto;

@RestController
@RequestMapping("/api")
public class PutApiController{
	
	@PutMapping("/put/{userId}")
	//public void put(@RequestBody PostRequestDto requestDto) { //리턴불가 
	//public PostRequestDto put(@RequestBody PostRequestDto requestDto) {
	public PostRequestDto put(@RequestBody PostRequestDto requestDto, @PathVariable(name = "userId") Long id) {	//pathVariable 예제 	
		System.out.println(id);
		return requestDto;
	}
	
}
