package com.jda.mealplanner.spoonacular.bindings;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "aisle", "image", "consitency", "name", "original", "originalString", "originalName",
		"amount", "unit", "meta", "metaInformation", "measures" })
public class ExtendedIngredient {

	@JsonProperty("id")
	public int id;
	@JsonProperty("aisle")
	public String aisle;
	@JsonProperty("image")
	public String image;
	@JsonProperty("consitency")
	public String consitency;
	@JsonProperty("name")
	public String name;
	@JsonProperty("original")
	public String original;
	@JsonProperty("originalString")
	public String originalString;
	@JsonProperty("originalName")
	public String originalName;
	@JsonProperty("amount")
	public double amount;
	@JsonProperty("unit")
	public String unit;
	@JsonProperty("meta")
	public List<String> meta = null;
	@JsonProperty("metaInformation")
	public List<String> metaInformation = null;
	@JsonProperty("measures")
	public Measures measures;

}