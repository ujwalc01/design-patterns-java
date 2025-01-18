package com.designpatterns.strategy;

public class CreditCardPayment implements PaymentStrategy {

	@Override
	public void pay(int amount) {
		
		System.out.println("Paying " + amount + " using Credit Card");
	}

}
