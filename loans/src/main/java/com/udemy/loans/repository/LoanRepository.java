package com.udemy.loans.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.udemy.loans.entity.Loans;

@Repository
public interface LoanRepository extends CrudRepository<Loans, Integer>{

	public List<Loans> getByCustomerIdOrderByCreatedTsDesc(int customerId);

}
