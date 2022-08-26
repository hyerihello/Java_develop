package com.example.server.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
//모든 매개변수 받음 
@AllArgsConstructor
public class UserDto {
	private String name;
	private int age;
}
