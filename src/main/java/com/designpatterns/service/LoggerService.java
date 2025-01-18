package com.designpatterns.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class LoggerService {
	
//	public LoggerService() {
//		System.out.println("LoggerService Instantiated..");
//	}
//	
//	public void logMessage(String message) {
//		System.out.println("Log: " + message);
//	}
	
	private static final Logger logger = LoggerFactory.getLogger(LoggerService.class);

    public void logMessage(String message) {
        logger.info(message);
    }

}
