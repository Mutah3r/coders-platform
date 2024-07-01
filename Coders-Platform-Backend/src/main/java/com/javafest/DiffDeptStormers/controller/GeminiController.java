package com.javafest.DiffDeptStormers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javafest.DiffDeptStormers.service.GeminiService;

@RestController
public class GeminiController {
	
	@Autowired
	GeminiService geminiService;
	@GetMapping("/prompt")
	public String getResponse(String prompt, String geminiKey) {
		return geminiService.callApi(prompt,geminiKey);
		
	}
	
}
