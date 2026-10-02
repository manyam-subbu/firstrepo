package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//public class TestController {
//	
//	@GetMapping("/hi")
////	@ResponseBody
//	public String showHi() {
//		System.out.println("hai");
//		return "NewFile";
//	}
//
//}

@RestController
public class TestController {
	
	@GetMapping("/hi")
	@ResponseBody
	public String showHi() {
		System.out.println("hai");
		System.out.println(" edit at 7:14");
		return "hai";
	}

}
