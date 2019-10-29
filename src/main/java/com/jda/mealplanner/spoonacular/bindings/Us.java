package com.jda.mealplanner.spoonacular.bindings;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "amount", "unitShort", "unitLong" })
public class Us {

	@JsonProperty("amount")
	public double amount;
	@JsonProperty("unitShort")
	public String unitShort;
	@JsonProperty("unitLong")
	public String unitLong;

}