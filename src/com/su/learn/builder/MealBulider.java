package com.su.learn.builder;

public class MealBulider {
	
	public Meal prepareVegMeal(){
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Coke());
		return meal;
	}
	
	public Meal prepareNonVegMeal(){
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Pepsi());
		return meal;
	}

}
