package com.task4;

import java.util.List;

public class Question {
	private int id;
	private String questionText;
    private List<Choice> choices;
    private int correctChoiceIndex;
    
    public Question(int id, String questionText, List<Choice> choices, int correctChoiceIndex) {
		super();
		this.id = id;
		this.questionText = questionText;
		this.choices = choices;
		this.correctChoiceIndex = correctChoiceIndex;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuestionText() {
		return questionText;
	}

	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}

	public List<Choice> getChoices() {
		return choices;
	}

	public void setChoices(List<Choice> choices) {
		this.choices = choices;
	}

	public int getCorrectChoiceIndex() {
		return correctChoiceIndex;
	}

	public void setCorrectChoiceIndex(int correctChoiceIndex) {
		this.correctChoiceIndex = correctChoiceIndex;
	}

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
    
	
    
}
