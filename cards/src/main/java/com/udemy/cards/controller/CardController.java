package com.udemy.cards.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.udemy.cards.entity.Cards;
import com.udemy.cards.entity.Customers;
import com.udemy.cards.repository.CardRepository;

@RestController
public class CardController {

	@Autowired
	private CardRepository repo;
	
	@PostMapping(value="/getCardDetails")
	public List<Cards> getCardDetailsById(@RequestBody final Customers customer){
		return repo.getByCustomerId(customer.getCustomerId());
	}
	
}
