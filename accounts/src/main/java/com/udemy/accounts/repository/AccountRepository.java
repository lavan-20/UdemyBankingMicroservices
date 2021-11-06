package com.udemy.accounts.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.udemy.accounts.entity.Accounts;

@Repository
public interface AccountRepository extends CrudRepository<Accounts,Long>{
	
	Accounts findByCustomerId(int customerId);
	
}
