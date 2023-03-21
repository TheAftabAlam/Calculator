package com.useCalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.calculator.Calculator;



@SpringBootApplication
public class UseCalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(UseCalculatorApplication.class, args);
		Calculator calculator=new Calculator();
		System.out.println(calculator.add(2, 5));
	}

}
