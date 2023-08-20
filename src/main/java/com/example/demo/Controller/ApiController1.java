package com.example.demo.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController1 {
	
	@GetMapping("1")
public String Welcome()
{
	return "Welcome String Boot!";
}
}