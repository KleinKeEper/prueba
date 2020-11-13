package com.prueba.app.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

	@GetMapping("get")
	public String home() {
		return "Hello World to deploy";
	}
	
	
	@GetMapping("list")
	public String home2() {
		return "Hello World to deploy Git Hub";
	}
	
}
