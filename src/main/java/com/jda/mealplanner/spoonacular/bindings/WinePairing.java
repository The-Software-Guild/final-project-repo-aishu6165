package com.jda.mealplanner.spoonacular.bindings;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "pairedWines", "pairingText", "productMatches" })
public class WinePairing {

	@JsonProperty("pairedWines")
	public List<Object> pairedWines = null;
	@JsonProperty("pairingText")
	public String pairingText;
	@JsonProperty("productMatches")
	public List<Object> productMatches = null;

}
