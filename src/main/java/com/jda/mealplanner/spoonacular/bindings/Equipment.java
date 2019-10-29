package com.jda.mealplanner.spoonacular.bindings;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "name", "image" })
public class Equipment {

	@JsonProperty("id")
	public int id;
	@JsonProperty("name")
	public String name;
	@JsonProperty("image")
	public String image;

}
