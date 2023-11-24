package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class saudacaoController {
	
	
	private static final String template = " Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/saudacao")
    public saudacao teste(@RequestParam(value = "name", defaultValue = "World")String name) {
    	return new saudacao(counter.incrementAndGet(), String.format(template, name));
    }
	
}