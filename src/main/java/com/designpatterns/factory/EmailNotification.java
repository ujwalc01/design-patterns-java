package com.designpatterns.factory;

public class EmailNotification implements Notification {
	
	public void send() {
        System.out.println("Sending Email notification");
    }

}
