package com.designpatterns.service;

import org.springframework.stereotype.Service;

import com.designpatterns.dto.NotificationResponseDTO;
import com.designpatterns.factory.Notification;
import com.designpatterns.factory.NotificationFactory;

@Service
public class NotificationService {

	public NotificationResponseDTO sendNotification(String type) {
        Notification notification = NotificationFactory.getNotification(type);
        notification.send();
        return new NotificationResponseDTO(type + " notification sent.");
    }
}
