package com.udemy.loans.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.udemy.loans.entity.Customers;
import com.udemy.loans.entity.Loans;
import com.udemy.loans.repository.LoanRepository;

@RestController
public class LoanController {

	@Autowired
	private LoanRepository repo;
	
	@PostMapping(value="/getLoanDetails")
	public List<Loans> getLoanDetails(@RequestBody final Customers customer) {
		List<Loans> loans = repo.getByCustomerIdOrderByCreatedTsDesc(customer.getCustomerId());
		return loans;
	}
}
