package com.udemy.accounts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.udemy.accounts.entity.Accounts;
import com.udemy.accounts.entity.Customers;
import com.udemy.accounts.repository.AccountRepository;

@RestController
public class AccountsController {

	@Autowired
	private AccountRepository repo;
	
	@RequestMapping(method = RequestMethod.POST, value="/getAccountByCustomerId")
	public Accounts getAccountDetails(@RequestBody Customers customer) {
		
		return repo.findByCustomerId(customer.getCustomerId());
	}
}
