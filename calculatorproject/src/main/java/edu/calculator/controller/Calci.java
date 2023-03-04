package edu.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.calculator.calcifunctions.CalculatorFuctions;

@RestController
public class Calci {
	//this method will return addition of two numbers
	@GetMapping("/calculator/add")
	public String addition(@RequestParam(value = "num1", required = true, defaultValue = "1") int num1,
		@RequestParam(value = "num2", required = true, defaultValue = "1") int num2) {
     
	  return "<center><h2>The sum of two numbers is " + CalculatorFuctions.addition(num1,num2)  + "</h2></center";
	}
	//this method will return subtraction of two numbers
	@GetMapping("/calculator/sub")
	public String subtraction(@RequestParam(value = "num1", required = true, defaultValue = "1") int num1,
		@RequestParam(value = "num2", required = true, defaultValue = "1") int num2) {

	  return "<center><h2>The sum of two numbers is " + CalculatorFuctions.subtraction(num1,num2)  + "</h2></center";
	}
	//this method will retrun multiplication of two numbers
	@GetMapping("/calculator/mul")
	public String multiply(@RequestParam(value = "num1", required = true, defaultValue = "1") int num1,
		@RequestParam(value = "num2", required = true, defaultValue = "1") int num2) {

	  return "<center><h2>The sum of two numbers is " + CalculatorFuctions.multiplication(num1, num2)+ "</h2></center";
	}
	//this method will return division of two numbers
	@GetMapping("/calculator/div")
	public String division(@RequestParam(value = "num1", required = true, defaultValue = "1") int num1,
		@RequestParam(value = "num2", required = true, defaultValue = "1") int num2) {

	  return "<center><h2>The sum of two numbers is " + CalculatorFuctions.division(num1, num2) + "</h2></center";
	}
	

}
