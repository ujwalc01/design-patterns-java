package com.designpatterns.service;

import org.springframework.stereotype.Service;

import com.designpatterns.dto.PaymentRequestDTO;
import com.designpatterns.strategy.CreditCardPayment;
import com.designpatterns.strategy.PayPalPayment;
import com.designpatterns.strategy.PaymentStrategy;

@Service
public class PaymentService {

	 public String processPayment(PaymentRequestDTO paymentRequest) {
	        PaymentStrategy paymentStrategy;

	        switch (paymentRequest.getMethod()) {
	            case "CreditCard":
	                paymentStrategy = new CreditCardPayment();
	                break;
	            case "PayPal":
	                paymentStrategy = new PayPalPayment();
	                break;
	            default:
	                return "Unsupported payment method.";
	        }

	        paymentStrategy.pay(paymentRequest.getAmount());
	        return "Payment of " + paymentRequest.getAmount() + " processed using " + paymentRequest.getMethod();
	    }
}
