package com.su.learn.command;

public class CommandPatternDeom {
	
	public static void main(String[] args) {
		Stock abcStock = new Stock();
		
		BuyStock buyStock = new BuyStock(abcStock);
		SellStock sellStock = new SellStock(abcStock);
		
		Broker broker = new Broker();
		broker.takeOrder(sellStock);
		broker.takeOrder(buyStock);
		
		broker.placeOrders();
	}

}
