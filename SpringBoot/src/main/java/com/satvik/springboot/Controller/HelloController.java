package com.satvik.springboot.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
        @RequestMapping("/Hello")	
		public String sayHi(){
			return "Welcome to Spring Boot";
		}

	

}
