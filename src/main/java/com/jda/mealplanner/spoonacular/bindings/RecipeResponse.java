package com.jda.mealplanner.spoonacular.bindings;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "vegetarian", "vegan", "glutenFree", "dairyFree", "veryHealthy", "cheap", "veryPopular",
		"sustainable", "weightWatcherSmartPoints", "gaps", "lowFodmap", "ketogenic", "whole30", "preparationMinutes",
		"cookingMinutes", "sourceUrl", "spoonacularSourceUrl", "aggregateLikes", "spoonacularScore", "healthScore",
		"creditsText", "sourceName", "pricePerServing", "extendedIngredients", "id", "title", "readyInMinutes",
		"servings", "image", "imageType", "cuisines", "dishTypes", "diets", "occasions", "winePairing", "instructions",
		"analyzedInstructions" })
public class RecipeResponse {

	@JsonProperty("vegetarian")
	public boolean vegetarian;
	@JsonProperty("vegan")
	public boolean vegan;
	@JsonProperty("glutenFree")
	public boolean glutenFree;
	@JsonProperty("dairyFree")
	public boolean dairyFree;
	@JsonProperty("veryHealthy")
	public boolean veryHealthy;
	@JsonProperty("cheap")
	public boolean cheap;
	@JsonProperty("veryPopular")
	public boolean veryPopular;
	@JsonProperty("sustainable")
	public boolean sustainable;
	@JsonProperty("weightWatcherSmartPoints")
	public int weightWatcherSmartPoints;
	@JsonProperty("gaps")
	public String gaps;
	@JsonProperty("lowFodmap")
	public boolean lowFodmap;
	@JsonProperty("ketogenic")
	public boolean ketogenic;
	@JsonProperty("whole30")
	public boolean whole30;
	@JsonProperty("preparationMinutes")
	public int preparationMinutes;
	@JsonProperty("cookingMinutes")
	public int cookingMinutes;
	@JsonProperty("sourceUrl")
	public String sourceUrl;
	@JsonProperty("spoonacularSourceUrl")
	public String spoonacularSourceUrl;
	@JsonProperty("aggregateLikes")
	public int aggregateLikes;
	@JsonProperty("spoonacularScore")
	public double spoonacularScore;
	@JsonProperty("healthScore")
	public double healthScore;
	@JsonProperty("creditsText")
	public String creditsText;
	@JsonProperty("sourceName")
	public String sourceName;
	@JsonProperty("pricePerServing")
	public double pricePerServing;
	@JsonProperty("extendedIngredients")
	public List<ExtendedIngredient> extendedIngredients = null;
	@JsonProperty("id")
	public int id;
	@JsonProperty("title")
	public String title;
	@JsonProperty("readyInMinutes")
	public int readyInMinutes;
	@JsonProperty("servings")
	public int servings;
	@JsonProperty("image")
	public String image;
	@JsonProperty("imageType")
	public String imageType;
	@JsonProperty("cuisines")
	public List<Object> cuisines = null;
	@JsonProperty("dishTypes")
	public List<String> dishTypes = null;
	@JsonProperty("diets")
	public List<String> diets = null;
	@JsonProperty("occasions")
	public List<String> occasions = null;
	@JsonProperty("winePairing")
	public WinePairing winePairing;
	@JsonProperty("instructions")
	public String instructions;
	@JsonProperty("analyzedInstructions")
	public List<AnalyzedInstruction> analyzedInstructions = null;

	public boolean isVegetarian() {
		return vegetarian;
	}

	public boolean isVegan() {
		return vegan;
	}

	public boolean isGlutenFree() {
		return glutenFree;
	}

	public boolean isDairyFree() {
		return dairyFree;
	}

	public boolean isVeryHealthy() {
		return veryHealthy;
	}

	public boolean isCheap() {
		return cheap;
	}

	public boolean isVeryPopular() {
		return veryPopular;
	}

	public boolean isSustainable() {
		return sustainable;
	}

	public int getWeightWatcherSmartPoints() {
		return weightWatcherSmartPoints;
	}

	public String getGaps() {
		return gaps;
	}

	public boolean isLowFodmap() {
		return lowFodmap;
	}

	public boolean isKetogenic() {
		return ketogenic;
	}

	public boolean isWhole30() {
		return whole30;
	}

	public int getPreparationMinutes() {
		return preparationMinutes;
	}

	public int getCookingMinutes() {
		return cookingMinutes;
	}

	public String getSourceUrl() {
		return sourceUrl;
	}

	public String getSpoonacularSourceUrl() {
		return spoonacularSourceUrl;
	}

	public int getAggregateLikes() {
		return aggregateLikes;
	}

	public double getSpoonacularScore() {
		return spoonacularScore;
	}

	public double getHealthScore() {
		return healthScore;
	}

	public String getCreditsText() {
		return creditsText;
	}

	public String getSourceName() {
		return sourceName;
	}

	public double getPricePerServing() {
		return pricePerServing;
	}

	public List<ExtendedIngredient> getExtendedIngredients() {
		return extendedIngredients;
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public int getReadyInMinutes() {
		return readyInMinutes;
	}

	public int getServings() {
		return servings;
	}

	public String getImage() {
		return image;
	}

	public String getImageType() {
		return imageType;
	}

	public List<Object> getCuisines() {
		return cuisines;
	}

	public List<String> getDishTypes() {
		return dishTypes;
	}

	public List<String> getDiets() {
		return diets;
	}

	public List<String> getOccasions() {
		return occasions;
	}

	public WinePairing getWinePairing() {
		return winePairing;
	}

	public String getInstructions() {
		return instructions;
	}

	@JsonProperty("analyzedInstructions")
	public List<AnalyzedInstruction> getAnalyzedInstructions() {
		return analyzedInstructions;
	}

	@JsonProperty("vegetarian")
	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}

	@JsonProperty("vegan")
	public void setVegan(boolean vegan) {
		this.vegan = vegan;
	}

	@JsonProperty("glutenFree")
	public void setGlutenFree(boolean glutenFree) {
		this.glutenFree = glutenFree;
	}

	@JsonProperty("dairyFree")
	public void setDairyFree(boolean dairyFree) {
		this.dairyFree = dairyFree;
	}

	@JsonProperty("veryHealthy")
	public void setVeryHealthy(boolean veryHealthy) {
		this.veryHealthy = veryHealthy;
	}

	@JsonProperty("cheap")
	public void setCheap(boolean cheap) {
		this.cheap = cheap;
	}

	@JsonProperty("veryPopular")
	public void setVeryPopular(boolean veryPopular) {
		this.veryPopular = veryPopular;
	}

	@JsonProperty("sustainable")
	public void setSustainable(boolean sustainable) {
		this.sustainable = sustainable;
	}

	@JsonProperty("weightWatcherSmartPoints")
	public void setWeightWatcherSmartPoints(int weightWatcherSmartPoints) {
		this.weightWatcherSmartPoints = weightWatcherSmartPoints;
	}

	@JsonProperty("gaps")
	public void setGaps(String gaps) {
		this.gaps = gaps;
	}

	@JsonProperty("lowFodmap")
	public void setLowFodmap(boolean lowFodmap) {
		this.lowFodmap = lowFodmap;
	}

	@JsonProperty("ketogenic")
	public void setKetogenic(boolean ketogenic) {
		this.ketogenic = ketogenic;
	}

	@JsonProperty("whole30")
	public void setWhole30(boolean whole30) {
		this.whole30 = whole30;
	}

	@JsonProperty("preparationMinutes")
	public void setPreparationMinutes(int preparationMinutes) {
		this.preparationMinutes = preparationMinutes;
	}

	@JsonProperty("cookingMinutes")
	public void setCookingMinutes(int cookingMinutes) {
		this.cookingMinutes = cookingMinutes;
	}

	@JsonProperty("sourceUrl")
	public void setSourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
	}

	@JsonProperty("spoonacularSourceUrl")
	public void setSpoonacularSourceUrl(String spoonacularSourceUrl) {
		this.spoonacularSourceUrl = spoonacularSourceUrl;
	}

	@JsonProperty("aggregateLikes")
	public void setAggregateLikes(int aggregateLikes) {
		this.aggregateLikes = aggregateLikes;
	}

	public void setSpoonacularScore(double spoonacularScore) {
		this.spoonacularScore = spoonacularScore;
	}

	public void setHealthScore(double healthScore) {
		this.healthScore = healthScore;
	}

	public void setCreditsText(String creditsText) {
		this.creditsText = creditsText;
	}

	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}

	public void setPricePerServing(double pricePerServing) {
		this.pricePerServing = pricePerServing;
	}

	public void setExtendedIngredients(List<ExtendedIngredient> extendedIngredients) {
		this.extendedIngredients = extendedIngredients;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setReadyInMinutes(int readyInMinutes) {
		this.readyInMinutes = readyInMinutes;
	}

	public void setServings(int servings) {
		this.servings = servings;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public void setImageType(String imageType) {
		this.imageType = imageType;
	}

	public void setCuisines(List<Object> cuisines) {
		this.cuisines = cuisines;
	}

	public void setDishTypes(List<String> dishTypes) {
		this.dishTypes = dishTypes;
	}

	public void setDiets(List<String> diets) {
		this.diets = diets;
	}

	public void setOccasions(List<String> occasions) {
		this.occasions = occasions;
	}

	public void setWinePairing(WinePairing winePairing) {
		this.winePairing = winePairing;
	}

	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

	@JsonProperty("analyzedInstructions")
	public void setAnalyzedInstructions(List<AnalyzedInstruction> analyzedInstructions) {
		this.analyzedInstructions = analyzedInstructions;
	}

}