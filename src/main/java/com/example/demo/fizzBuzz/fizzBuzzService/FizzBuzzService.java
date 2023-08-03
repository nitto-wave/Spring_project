package com.example.demo.fizzBuzz.fizzBuzzService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class FizzBuzzService {

	public List<String> generateFizzBuzz() {
		
		List<String> list = new ArrayList<>();

		for (int i = 0; i <= 100; i++) {
			
			if (i % 15 == 0) {
				
				list.add("FizzBuzz");
			} else if (i % 3 == 0) {
				
				list.add("Fizzz");
			} else if (i % 5 == 0) {
				
				list.add("Buzz");
			} else {

				list.add(Integer.toString(i));
			}
		}
		return list;
	}
}