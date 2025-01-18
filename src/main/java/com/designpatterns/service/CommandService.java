package com.designpatterns.service;

import org.springframework.stereotype.Service;

import com.designpatterns.command.OrderCommand;
import com.designpatterns.command.OrderInvoker;
import com.designpatterns.command.OrderReceiver;

@Service
public class CommandService {

	public String processOrder() {
        OrderReceiver orderReceiver = new OrderReceiver();
        OrderCommand orderCommand = new OrderCommand(orderReceiver);
        OrderInvoker orderInvoker = new OrderInvoker();
        
        orderInvoker.setOrderCommand(orderCommand);
        orderInvoker.executeOrder();
        
        return "Order processed successfully.";
    }
}
