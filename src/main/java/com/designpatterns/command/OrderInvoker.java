package com.designpatterns.command;

public class OrderInvoker {

	private OrderCommand orderCommand;

    public void setOrderCommand(OrderCommand orderCommand) {
        this.orderCommand = orderCommand;
    }

    public void executeOrder() {
        orderCommand.execute();
    }
}
