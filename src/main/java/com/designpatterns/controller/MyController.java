package com.designpatterns.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.designpatterns.dto.NotificationResponseDTO;
import com.designpatterns.dto.PaymentRequestDTO;
import com.designpatterns.service.CommandService;
import com.designpatterns.service.LoggerService;
import com.designpatterns.service.NotificationService;
import com.designpatterns.service.OrderService;
import com.designpatterns.service.PaymentService;

@RestController
@RequestMapping("/api")
public class MyController {

    private final LoggerService loggerService;
    private final OrderService orderService;
    private final NotificationService notificationService;
    private final PaymentService paymentService;
    private final CommandService commandService;

    @Autowired
    public MyController(LoggerService loggerService, OrderService orderService, 
                        NotificationService notificationService, PaymentService paymentService, 
                        CommandService commandService) {
        this.loggerService = loggerService;
        this.orderService = orderService;
        this.notificationService = notificationService;
        this.paymentService = paymentService;
        this.commandService = commandService;
    }

    @GetMapping("/logMessage")
    public String logMessage(@RequestParam String message) {
        loggerService.logMessage(message);
        return "Message logged successfully!";
    }

    @GetMapping("/updateOrderStatus")
    public String updateOrderStatus(@RequestParam String status) {
        orderService.updateOrderStatus(status);
        return "Order status updated to: " + status;
    }

    @GetMapping("/decorateCar")
    public String decorateCar() {
        return orderService.decorateCar();
    }

    @PostMapping("/pay")
    public String pay(@RequestBody PaymentRequestDTO paymentRequest) {
        return paymentService.processPayment(paymentRequest);
    }

    @GetMapping("/sendNotification")
    public NotificationResponseDTO sendNotification(@RequestParam String type) {
        return notificationService.sendNotification(type);
    }

    @PostMapping("/processOrder")
    public String processOrder() {
        return commandService.processOrder();
    }
}
