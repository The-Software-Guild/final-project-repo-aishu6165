package com.mealplanner.model;

public class MealInfo {

	private final String name;
	private final int readyInMinutes;
	private final double healthScore;
	private final String instructions;
	private final String image;

	public MealInfo(String name, int timeToPrepare,double healthScore, String instructions,String image) {
		super();
		this.name = name;
		this.readyInMinutes = timeToPrepare;
		this.healthScore=healthScore;
		this.instructions = instructions;
		this.image=image;
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

	public String getImage() {
		return image;
	}

	public double getHealthScore() {
		return healthScore;
	}
}
