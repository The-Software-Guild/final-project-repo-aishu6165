package com.jda.mealplanner.spoonacular.bindings;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "name", "steps" })
public class AnalyzedInstruction {

	@JsonProperty("name")
	public String name;
	@JsonProperty("steps")
	public List<Step> steps = null;

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	public List<Step> getSteps() {
		return steps;
	}

}
