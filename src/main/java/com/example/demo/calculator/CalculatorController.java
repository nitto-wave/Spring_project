package com.example.demo.calculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {

	@GetMapping("/calculatorFunction")
	public String doGet() {

		return "calculatorFunction";
	}

	@PostMapping("/calculatorResult")
	public String doPost(@RequestParam("num1") int num1, @RequestParam("num2") int num2,
			@RequestParam("operation") String operation, Model model) {

		double result;

		switch (operation) {

		case "add":
			result = num1 + num2;
			break;

		case "subtract":
			result = num1 - num2;
			break;

		case "multiply":
			result = num1 * num2;
			break;

		case "divide":
			if (num2 == 0) {

				model.addAttribute("error", "0で割ることはできません。");
				return "calculatorFunction";
			}

			result = num1 / (double) num2;
			break;
		default:
			model.addAttribute("error", "無効な演算");
			return "calculatorFunction";
		}

		model.addAttribute("result", result);

		return "calculatorResult";
	}
}