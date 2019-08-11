package com.learning.jwt;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JwtController {
	
	@RequestMapping({ "/jwt" })
	public String firstPage() {
		return "Hello World";
	}
}
