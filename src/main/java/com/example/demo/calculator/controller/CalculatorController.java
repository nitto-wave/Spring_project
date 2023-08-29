package com.example.demo.calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.calculator.service.CalculatorService;

@Controller
public class CalculatorController {

	@GetMapping("/calculatorResult")
	public String displayForm() {

		return "calculatorResult";
	}

	@PostMapping("/calculatorResult")
	public String doPost(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2,
			@RequestParam("operation") String operation, Model model) {
		CalculatorService calculatorService = new CalculatorService();

		try {

			int result = calculatorService.calculator(num1, num2, operation);

			model.addAttribute("result", result);
		} catch (Exception e) {

			model.addAttribute("error", e.getMessage());
		}
		return "calculatorResult";
	}
}
