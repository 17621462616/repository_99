package com.xx.springbootdemo.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello2")
public class HelloController {

	@RequestMapping("test01")
	public void test01() {
		System.out.println("springboot project--->hello world...");
	}
}
