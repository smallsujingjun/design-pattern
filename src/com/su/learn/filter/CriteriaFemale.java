package com.su.learn.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		// TODO Auto-generated method stub
		List<Person> femalePerson = new ArrayList<Person>();
		for (Person person : persons) {
			if("female".equalsIgnoreCase(person.getGender())){
				femalePerson.add(person);
			}
		}
		return femalePerson;
	}

}
