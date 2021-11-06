package com.udemy.cards.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.udemy.cards.entity.Cards;

@Repository
public interface CardRepository extends CrudRepository<Cards, Integer>{

	public List<Cards> getByCustomerId(int customerId);

}
