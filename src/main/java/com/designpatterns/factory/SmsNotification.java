package com.designpatterns.factory;

public class SmsNotification implements Notification {
	
	public void send() {
        System.out.println("Sending SMS notification");
    }
}
