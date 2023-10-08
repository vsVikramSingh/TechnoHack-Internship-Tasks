package com.task4;

public class Choice {
	private int id;
    private String choiceText;
	public Choice(int id, String choiceText) {
		super();
		this.id = id;
		this.choiceText = choiceText;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getChoiceText() {
		return choiceText;
	}
	public void setChoiceText(String choiceText) {
		this.choiceText = choiceText;
	}
	public Choice() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}
