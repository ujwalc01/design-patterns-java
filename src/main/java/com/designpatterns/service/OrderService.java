package com.designpatterns.service;

import org.springframework.stereotype.Service;

import com.designpatterns.decorator.Car;
import com.designpatterns.decorator.SportsCarDecorator;
import com.designpatterns.observer.OrderNotification;
import com.designpatterns.observer.OrderSubject;

@Service
public class OrderService {

	private final OrderSubject orderSubject;

    public OrderService() {
        this.orderSubject = new OrderSubject();
    }

    public void updateOrderStatus(String status) {
        orderSubject.addObserver(new OrderNotification());
        orderSubject.setOrderStatus(status);
    }

    public String decorateCar() {
        Car basicCar = new Car() {
            @Override
            public void assemble() {
                System.out.println("Basic car assembled.");
            }
        };
        Car sportsCar = new SportsCarDecorator(basicCar);
        sportsCar.assemble();
        return "Sports car decorated and assembled.";
    }
}
