package com.su.learn.composite;

public class CompositePatternDemo {
	
	
	public static void main(String[] args) {
		Employee CEO = new Employee("Jerry", "CEO", 30000);
		Employee headSale = new Employee("Tom", "Head Sale", 20000);
		Employee headMarket = new Employee("Jhon", "Head Market", 20000);
		
		Employee sale1 = new Employee("Mike", "Sale", 8000);
		Employee sale2 = new Employee("Marry", "Sale", 8000);
		
		Employee market1 = new Employee("Bob", "Market", 5000);
		Employee market2 = new Employee("yob", "Market", 5000);
		
		CEO.add(headMarket);
		CEO.add(headSale);
		
		headSale.add(sale1);
		headSale.add(sale2);
		
		headMarket.add(market1);
		headMarket.add(market2);
		
		
		System.out.println(CEO);
		for (Employee e : CEO.getSubordinates()) {
			System.out.println(e);
			for (Employee el : e.getSubordinates()) {
				System.out.println(el);
			}
			System.out.println();
		}
	}

}
