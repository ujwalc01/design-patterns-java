package com.designpatterns.factory;


public class NotificationFactory {

	public static Notification getNotification(String type) {
        
		if("Email".equalsIgnoreCase(type)) {
            return new EmailNotification();
        } 
		else if("SMS".equalsIgnoreCase(type)) {
            return new SmsNotification();
        }
		
        return null;
    }
	
}
