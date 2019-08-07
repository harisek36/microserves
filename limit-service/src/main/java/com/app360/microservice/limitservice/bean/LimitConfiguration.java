package com.app360.microservice.limitservice.bean;

import lombok.Data;

@Data
public class LimitConfiguration {
	private int max;
	private int min;
	
	protected LimitConfiguration() {
		
	}
	
	public LimitConfiguration(int max, int min) {
		this.max = max;
		this.min = min;
	}

}
