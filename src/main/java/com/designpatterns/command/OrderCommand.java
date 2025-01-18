package com.designpatterns.command;

public class OrderCommand {
	
    private final OrderReceiver orderReceiver;

    public OrderCommand(OrderReceiver orderReceiver) {
        this.orderReceiver = orderReceiver;
    }

    public void execute() {
        orderReceiver.processOrder();
    }
}
