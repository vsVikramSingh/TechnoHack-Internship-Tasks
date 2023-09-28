package com.task2;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class NumberGuessingService {
	private final int minNumber = 1;
    private final int maxNumber = 100;
    private final int secretNumber = new Random().nextInt(maxNumber - minNumber + 1) + minNumber;
    private int attempts = 0;

    public String checkGuess(int guess) {
        attempts++;
        if (guess == secretNumber) {
            return "Congratulations! You guessed it in " + attempts + " attempts.";
        } else{
            return "Incurrect";
        }
    }
}
