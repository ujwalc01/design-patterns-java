package com.designpatterns.dto;

public class NotificationResponseDTO {

    private String message;

    public NotificationResponseDTO(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

