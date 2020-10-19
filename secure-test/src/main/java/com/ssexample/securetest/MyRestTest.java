package com.ssexample.securetest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestTest {

	@GetMapping("/")
	public String home() {
		return new String("Hello my fen for fun");
	}
	
	@GetMapping("/hello")
	public String hello() {
		return new String("Hello my fen of fen");
	}
	
	@GetMapping("/halo")
	public String halo() {
		return new String("Halo my fen of fen");
	}
}
