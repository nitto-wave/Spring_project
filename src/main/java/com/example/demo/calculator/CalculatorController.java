package com.example.demo.calculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {

	@PostMapping("/calculatorResult")
	public String doPost(@RequestParam("num1") int num1, @RequestParam("num2") int num2,
			@RequestParam("operation") String operation, Model model) {
		CalculatorService calculatorService = new CalculatorService();

		try {

			int result = calculatorService.calculator(num1, num2, operation);

			model.addAttribute("result", result);
			return "calculatorResult";
		} catch (Exception e) {

			model.addAttribute("error", e.getMessage());

			return "calculatorResult";
		}
	}
}
