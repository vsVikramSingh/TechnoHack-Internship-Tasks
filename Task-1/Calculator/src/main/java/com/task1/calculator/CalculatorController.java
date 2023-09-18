package com.task1.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CalculatorController {
	private final CalculatorService calculatorService;

    @Autowired
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/")
    public String showCalculator(Model model) {
        model.addAttribute("calculatorResult", new CalculatorResult());
        return "calculator";
    }

    @PostMapping("/calculate")
    public String calculate(
            @ModelAttribute CalculatorResult calculatorResult,
            Model model) {
        double result = calculatorService.calculate(
            calculatorResult.getNum1(),
            calculatorResult.getOperation(),
            calculatorResult.getNum2()
        );
        calculatorResult.setResult(result);
        model.addAttribute("calculatorResult", calculatorResult);
        return "calculator";
    }
}
