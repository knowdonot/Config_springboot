package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

	 @Value("${name}")//从application.properties文件中获取值
	private String myName;
	
	@RequestMapping("/index")
	public String sayHello(String name){
		name =  name!= null  ?name : myName;
		return "hello ,"+name;
	}
}
