package com.jda.mealplanner.controllers;

public class GenerateMealPlan {

	private int calories;
	private String suggestedDiet;

	public GenerateMealPlan(int calories, String suggestedDiet) {
		super();
		this.calories = calories;
		this.suggestedDiet = suggestedDiet;
	}

	public int getCalories() {
		return calories;
	}

	public String getSuggestedDiet() {
		return suggestedDiet;
	}

}
