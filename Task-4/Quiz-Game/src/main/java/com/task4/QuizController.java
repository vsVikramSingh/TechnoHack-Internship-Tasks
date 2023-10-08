package com.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class QuizController {
	private List<Question> questions = new ArrayList<>();

    @GetMapping("/")
    public String startQuiz(Model model) {
        // Sample Questions and Choices
        Question question1 = new Question(1, "What is the capital of France?", Arrays.asList(
            new Choice(1, "Paris"),
            new Choice(2, "London"),
            new Choice(3, "Berlin"),
            new Choice(4, "Madrid")
        ), 1); // Correct answer is "Paris"

        Question question2 = new Question(2, "Which programming language is known for its 'Pythonic' code readability?", Arrays.asList(
            new Choice(1, "Java"),
            new Choice(2, "Python"),
            new Choice(3, "C++"),
            new Choice(4, "JavaScript")
        ), 2); // Correct answer is "Python"

        questions.add(question1);
        questions.add(question2);

        model.addAttribute("questions", questions);
        model.addAttribute("userAnswers", new ArrayList<Integer>());
        return "quiz";
    }

    @PostMapping("/submit")
    public String submitQuiz(@ModelAttribute("userAnswers") List<Integer> userAnswers, Model model) {
        int score = calculateScore(userAnswers);
        model.addAttribute("score", score);
        return "result";
    }

    private int calculateScore(List<Integer> userAnswers) {
        int score = 0;
        for (int i = 0; i < questions.size(); i++) {
            if (userAnswers.get(i) == questions.get(i).getCorrectChoiceIndex()) {
                score++;
            }
        }
        return score;
    }
    @ModelAttribute("userAnswers")
    public List<Integer> userAnswers() {
        return new ArrayList<>();
    }

}
