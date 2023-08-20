package com.example.demo.minus;

import org.springframework.stereotype.Service;

@Service
public class MinusService {
	public int minus(Integer num1, Integer num2) throws Exception {

		if(num1 == null ||  num2 == null) {
			throw new Exception("値を入力してください");
		}
		return num1 - num2;
	}
}
