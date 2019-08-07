package com.app360.microservice.currencyexchangeservice.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.Data;

@Data
@Entity
public class ExchangeValue {
	
	@Id
	private int id;
	private String fromCurr;
	private String toCurr;
	private BigDecimal conversionMultiple;
	private int port;
	
	public ExchangeValue() {
	}
	
	public ExchangeValue(int id, String from, String to, BigDecimal conversionMultiple) {
		this.id = id;
		this.fromCurr = from;
		this.toCurr = to;
		this.conversionMultiple = conversionMultiple;
	}

}
