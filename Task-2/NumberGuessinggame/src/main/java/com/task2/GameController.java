package com.task2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GameController {
	@Autowired
    private NumberGuessingService guessingService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/guess")
    public String guessNumber(@RequestParam("guess") int guess, Model model) {
        String result = guessingService.checkGuess(guess);
        model.addAttribute("result", result);
        return "index";
    }
}
