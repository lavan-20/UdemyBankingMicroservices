package com.udemy.cards.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cards {
	
	@Column(name="CARD_NUMBER")
	@Id
	private int cardNumber;
	
	@Column(name="CUSTOMER_ID")
	private int customerId;
	
	@Column(name="CARD_TYPE")
	private String cardType;
	
	@Column(name="TOTAL_AMOUNT")
	private int totalAmount;
	
	@Column(name="SPENT_AMOUNT")
	private int spentAmount;
	
	@Column(name="BALANCE_AMOUNT")
	private int balanceAmount;
	
	@Column(name="VALID_FROM")
	private Date validFrom;

	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

	public int getSpentAmount() {
		return spentAmount;
	}

	public void setSpentAmount(int spentAmount) {
		this.spentAmount = spentAmount;
	}

	public int getBalanceAmount() {
		return balanceAmount;
	}

	public void setBalanceAmount(int balanceAmount) {
		this.balanceAmount = balanceAmount;
	}

	public Date getValidFrom() {
		return validFrom;
	}

	public void setValidFrom(Date validFrom) {
		this.validFrom = validFrom;
	}
	
}
