package com.su.learn.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> malePerson = new ArrayList<Person>();
		for (Person person : persons) {
			if("male".equalsIgnoreCase(person.getGender())){
				malePerson.add(person);
			}
		}
		return malePerson;
	}

}
