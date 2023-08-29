package com.example.demo.minus.service;

import org.springframework.stereotype.Service;

@Service
public class MinusService {
	public int minus(Integer num1, Integer num2) throws Exception {

		if (num1 == null || num2 == null) {
			
			throw new Exception("無効な演算です");
		}

		return num1 - num2;
	}
}
