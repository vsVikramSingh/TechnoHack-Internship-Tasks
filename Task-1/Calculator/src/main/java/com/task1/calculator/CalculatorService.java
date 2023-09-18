package com.task1.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
	public double calculate(double num1, String operation, double num2) {
        switch (operation) {
            case "add":
                return num1 + num2;
            case "subtract":
                return num1 - num2;
            case "multiply":
                return num1 * num2;
            case "divide":
                if (num2 == 0) {
                    throw new IllegalArgumentException("Cannot divide by zero");
                }
                return num1 / num2;
            default:
                throw new IllegalArgumentException("Invalid operation");
        }
    }
}
