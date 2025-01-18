package com.designpatterns.observer;

public class OrderNotification implements OrderObserver {

	public void update(String orderStatus) {
        System.out.println("Order status updated: " + orderStatus);
    }
}
