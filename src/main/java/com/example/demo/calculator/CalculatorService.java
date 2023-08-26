package com.example.demo.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

	public int calculator(Integer num1, Integer num2, String operation) throws Exception {
		validateInput(num1, num2, operation);

		switch (operation) {
		case "add":
			return num1 + num2;
		case "subtract":
			return num1 - num2;
		case "multiply":
			return num1 * num2;
		case "divide":

			if (num2 == 0) {
				throw new Exception("0で割ることはできません。");
			}

			return num1 / num2;

		default:
			throw new Exception("無効な操作: " + operation);
		}
	}

	private void validateInput(Integer num1, Integer num2, String operation) throws Exception {

		if (num1 == null || num2 == null || operation == null || operation.trim().isEmpty()) {

			throw new Exception("無効な演算です");
		}
	}
}
