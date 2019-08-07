package com.app360.microservice.currencyconversionservice.bean;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class CurrencyConversionBean {
	private Long id;
	private String from;
	private String to;
	private BigDecimal quantity;
	private BigDecimal conversionMultiple;
	private BigDecimal totalAmount;
	private int port;

	public CurrencyConversionBean() {
	}

	public CurrencyConversionBean(Long id, String from, String to, BigDecimal quantity, BigDecimal conversionMultiple,
			BigDecimal totalAmount, int port) {
		this.id = id;
		this.from = from;
		this.to = to;
		this.quantity = quantity;
		this.conversionMultiple = conversionMultiple;
		this.totalAmount = totalAmount;
		this.port = port;
	}

	
}
