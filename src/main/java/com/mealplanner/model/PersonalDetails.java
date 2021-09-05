package com.mealplanner.model;

public class PersonalDetails {
    private int id;
    private String name;
    private String age;
    private String number;
    private String email;
    private String height;
    private String weight;
    private String diet;
    private String recipe;

    public PersonalDetails() {
    }

    public PersonalDetails(int id, String name, String age, String number, String email, String height, String weight, String diet, String recipe) {
        this.id=id;
        this.name=name;
        this.age=age;
        this.number=number;
        this.email=email;
        this.height=height;
        this.weight=weight;
        this.diet=diet;
        this.recipe=recipe;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }
}
