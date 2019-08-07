package com.app360.microservice.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app360.microservice.currencyexchangeservice.entity.ExchangeValue;

@Repository
public interface ExchangeValueIRepo extends JpaRepository<ExchangeValue, Integer> {
	
	ExchangeValue findByFromCurrAndToCurr(String fromCurr, String toCurr);
}
