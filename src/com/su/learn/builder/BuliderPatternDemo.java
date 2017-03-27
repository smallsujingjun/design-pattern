package com.su.learn.builder;

public class BuliderPatternDemo {
	
	public static void main(String[] args) {
		
		MealBulider mealBulider = new MealBulider();
		Meal vegMeal = mealBulider.prepareVegMeal();
		System.out.println("vegMeal:");
		vegMeal.showItem();
		vegMeal.getCost();
		
		Meal nonVegMeal = mealBulider.prepareNonVegMeal();
		System.out.println("nonVegMeal:");
		nonVegMeal.showItem();
		nonVegMeal.getCost();
	}

}
