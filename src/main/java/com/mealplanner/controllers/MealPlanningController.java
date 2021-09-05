package com.mealplanner.controllers;

import com.mealplanner.model.MealInfo;
import com.mealplanner.spoonacular.service.MealPlanningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.thymeleaf.spring5.context.webflux.ReactiveDataDriverContextVariable;
import reactor.core.publisher.Flux;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class MealPlanningController {

	@Autowired
	MealPlanningService service;

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/planning")
	public String planning(Model model) {
		return "planning";
	}

	@PostMapping("/generatePlan")
	public String add(@ModelAttribute("form") GenerateMealPlan form, Model model) {
		model.addAttribute("meals", new ReactiveDataDriverContextVariable(
				service.generate(Integer.valueOf(form.getCalories()), form.getSuggestedDiet()), 2));
		return "planning";
	}
}
