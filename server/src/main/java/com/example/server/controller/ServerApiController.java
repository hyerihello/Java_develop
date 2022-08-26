package com.example.server.controller;

import java.net.URI;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.example.server.model.ReqDto;
import com.example.server.model.ReqDto.Header;
import com.example.server.model.UserDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j //log
@RestController
@RequestMapping("/api/server")
public class ServerApiController {
	
	@GetMapping("/naver")
	public String naver() {
// https://openapi.naver.com/v1/search/local.json
//		?query=%EA%B0%88%EB%B9%84%EC%A7%91
//		&display=10
//		&start=1
//		&sort=random
		
		String query = "갈비찜";
		//String encode = Base64.getEncoder().encodeToString(query.getBytes(StandardCharsets.UTF_8));
		
		URI uri = UriComponentsBuilder
				.fromUriString("https://openapi.naver.com")
				.path("/v1/search/local.json")
				.queryParam("query", "갈비찜")
				.queryParam("display", 10)
				.queryParam("start", 1)
				.queryParam("sort", "random")
				.encode(Charset.forName("UTF-8"))
				.build()
				.toUri();
		
		log.info("uri : {}" , uri);
		
		
		RestTemplate restTemplate = new RestTemplate();
		
		//header
		RequestEntity<Void> req = RequestEntity
				.get(uri)
				.header("X-Naver-Client-Id", "8QNqZBmYc33EUvV2Qz2C")
				.header("X-Naver-Client-Secret", "vxcuNAzY2G")
				.build();
		
		
		ResponseEntity<String> result = restTemplate.exchange(req, String.class);
		return result.getBody();
		
	}
	
	

private RequestEntity<Void> RequestEntity() {
		// TODO Auto-generated method stub
		return null;
	}



	// ================== GET ===========================
	@GetMapping("/hello")
	//public String hello() {
	//public UserDto hello() {
	// 전달된 값을 받아 사용할때!
	public UserDto hello(@RequestParam String name, @RequestParam int age) {
		UserDto user = new UserDto();
		//user.setName("ila");
		//user.setAge(31);
		
		user.setName(name);
		user.setAge(age);
		
		return user;
		//return "hello server";
	}
// ===================================================
// ================== Post / exchange ===========================
	@PostMapping("user/{userId}/name/{userName}")
	public ReqDto<UserDto> post(@RequestBody ReqDto<UserDto> user, 
						@PathVariable int userId, 
						@PathVariable String userName,
						@RequestHeader("x-authorization") String authorization, //추가 
						@RequestHeader("custom-header") String customheader // 추가 
	) {
		log.info("userId : {}, userName : {} ", userId, userName);
		log.info("client req : {}",user);
		log.info("authorization : {}, customheader : {} ", authorization, customheader);
		ReqDto<UserDto> response = new ReqDto<>();
		response.setHeader(
				new ReqDto.Header()
		);
		response.setBody(user.getBody());
		return response;
	}
// ===================================================	
}
