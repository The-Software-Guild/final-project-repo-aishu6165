package com.jda.mealplanner.model;

public class MealInfo {

	private final String name;
	private final int readyInMinutes;
	private final String instructions;

	public MealInfo(String name, int timeToPrepare, String instructions) {
		super();
		this.name = name;
		this.readyInMinutes = timeToPrepare;
		this.instructions = instructions;
	}

	public String getName() {
		return name;
	}

	public int getReadyInMinutes() {
		return readyInMinutes;
	}

	public String getInstructions() {
		return instructions;
	}

}
