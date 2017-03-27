package com.su.learn.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		// TODO Auto-generated method stub
		List<Person> singlePerson = new ArrayList<Person>();
		for (Person person : persons) {
			if("single".equalsIgnoreCase(person.getMaritalStatus())){
				singlePerson.add(person);
			}
		}
		return singlePerson;
	}

}
