package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController3 {
	@Value("${var3}")
	private String yourFavColor;
@GetMapping("3")
	public String getMyFav()
	
	{
		return "My favorite color is"+yourFavColor;
	}
}
