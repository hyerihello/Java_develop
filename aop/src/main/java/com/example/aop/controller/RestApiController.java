package com.example.aop.controller;

import org.springframework.util.StopWatch;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.aop.annotation.Decode;
import com.example.aop.annotation.Timer;
import com.example.aop.dto.User;

@RestController
@RequestMapping("/api")
public class RestApiController {
	
	/* 
	 	RequestParam과 PathVariable 차이 
	 ** RequestParam
		http://192.168.0.1:8080?aaa=bbb&ccc=ddd
	 ** PathVariable
		http://192.168.0.1:8080/bbb/ddd
	 */
	
	// URL: http://localhost:9091/api/get/100?name=ila
	@GetMapping("/get/{id}")
//	public void get(@PathVariable Long id, @RequestParam String name ) {
//		System.out.println("get method");
//		System.out.println("get method : " + id);
//		System.out.println("get method : " + name);
//	}
	
	public String get(@PathVariable Long id, @RequestParam String name ) {
		//System.out.println("get method");
		//System.out.println("get method : " + id);
		//System.out.println("get method : " + name);
		
		StopWatch stopwatch = new StopWatch();
		stopwatch.start();
		
		//TODO
		
		stopwatch.stop();
		System.out.println("total :" + stopwatch.getTotalTimeSeconds());
		
		
		return id + " " + name;
	}
	
	
	@PostMapping("/post")
//	public void post(@RequestBody User user) {
//		System.out.println("post method : " + user);
//		
//	}
	
	public User post(@RequestBody User user) {
		//System.out.println("post method : " + user);

		
		return user;
		
		
		
	}
	
	@Timer
	@DeleteMapping("/delete")
	public void delete() throws InterruptedException {
		
		//db logic
		Thread.sleep(1000*2);

	}
	
	@Decode
	@PutMapping("/put")
	public User put(@RequestBody User user) {
		System.out.println("put");
		System.out.println(user);
		return user;		
	}
}
