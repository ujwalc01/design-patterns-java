package com.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class OrderSubject {

	private List<OrderObserver> observers = new ArrayList<>();
    private String orderStatus;

    public void addObserver(OrderObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(OrderObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (OrderObserver observer : observers) {
            observer.update(orderStatus);
        }
    }

    public void setOrderStatus(String status) {
        this.orderStatus = status;
        notifyObservers();
    }
    
}
