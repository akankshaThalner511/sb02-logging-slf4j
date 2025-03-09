package com.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppLogInfoController {
	
	Logger logger = LoggerFactory.getLogger(AppLogInfoController.class);
	
	@GetMapping("/welcome")
	public String  getWelcMsg() {
		logger.info("getWelMsg() -->  Method execution started........");
		
		String msg = "Welcome StringBootWaves";
		
		
		try {
			int a = 10/0;
		}catch(Exception ex) {
			logger.error("Error accurs during execution ......"+ ex.getMessage());
		}
		
		
		logger.info("getWelMsg() --> Method execution ended.......");
		
		return msg;
	}

}
