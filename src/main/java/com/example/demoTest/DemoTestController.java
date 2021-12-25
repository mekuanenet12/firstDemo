package com.example.demoTest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoTestController {

	@RequestMapping
	public String name() {
		return "Hello Meku";
	}
}
