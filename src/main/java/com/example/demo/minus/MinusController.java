package com.example.demo.minus;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MinusController {

	@GetMapping("/minusResult")
	public String displayForm() {

		return "minusResult";
	}

	@PostMapping("/minusResult")
	public String doPost(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2, Model model) throws Exception {

		MinusService minusService = new MinusService();

        try {
        	
            int result = minusService.minus(num1, num2);
            model.addAttribute("result", result);
        } catch (Exception e) {
        	
            model.addAttribute("error", e.getMessage());
        }
        return "minusResult";
	}
}
