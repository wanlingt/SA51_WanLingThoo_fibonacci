package com.example.fibonaccirestservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FibonacciController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	//returns the 2 lists of Fibonacci sequences
	@GetMapping("/fibonacci")
	@ResponseBody
	public Fibonacci fibonacci(@RequestBody Input elements) {
		Fibonacci fibonacci = new Fibonacci(elements.getElements());
		return fibonacci;
	}
	
	//returns a standard greeting
	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "User") String name) {
		return new Greeting(String.format(template, name));
	}
}
