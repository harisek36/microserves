package com.app360.microservice.limitservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app360.microservice.limitservice.bean.LimitConfiguration;

@RestController
public class LimitConfigurationController {
	
	@Autowired
	private ConfigurationFile configuration;
	
	@GetMapping
	public LimitConfiguration retriveLimitConfig() {
		return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
	}

}
