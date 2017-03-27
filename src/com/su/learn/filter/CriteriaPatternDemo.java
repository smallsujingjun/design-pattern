package com.su.learn.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaPatternDemo {
	
	public static void main(String[] args) {
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("Jreey", "male", "single"));
		persons.add(new Person("Tom", "female", "single"));
		persons.add(new Person("Robert", "male", "married"));
		persons.add(new Person("John", "female", "married"));
		persons.add(new Person("Mike", "female", "single"));
		persons.add(new Person("Bobby", "female", "married"));
		persons.add(new Person("Diana", "male", "married"));
		
		Criteria female = new CriteriaFemale();
		Criteria male = new CriteriaMale();
		Criteria single = new CriteriaSingle();
		Criteria femaleAndSingle = new AndCriteria(female, single);
		Criteria maleOrSingle = new OrCriteria(male, single);
		
		System.out.println("female:");
		print(female.meetCriteria(persons));
		
		System.out.println("male:");
		print(male.meetCriteria(persons));
		
		System.out.println("single:");
		print(single.meetCriteria(persons));
		
		System.out.println("femaleAndSingle:");
		print(femaleAndSingle.meetCriteria(persons));
		
		System.out.println("maleOrSingle:");
		print(maleOrSingle.meetCriteria(persons));
		
	}
	
	public static void print(List<Person> personList){
		
		for (Person person : personList) {
			System.out.println(person);
		}
		
	}
	
	

}
