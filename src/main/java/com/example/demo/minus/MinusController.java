package com.example.demo.minus;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MinusController {

	@GetMapping("/minusFunction")
	public String doGet() {

		return "minusFunction";
	}

	@PostMapping("/minusResult")
	public String doGet(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {

		int result = num1 - num2;
		model.addAttribute("result", result);

		return "minusResult";
	}
}
