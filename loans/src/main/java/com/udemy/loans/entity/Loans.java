package com.udemy.loans.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter @ToString
public class Loans {

	@Column(name="LOAN_ID")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int loanId;
	
	@Column(name="CUSTOMER_ID")
	private int customerId;
	
	@Column(name="LOAN_TYPE")
	private String loanType;
	
	@Column(name="START_DATE")
	private Date startDate;
	
	@Column(name="TOTAL_AMOUNT")
	private int totalAmount;
	
	@Column(name="PAID_AMOUNT")
	private int paidAmount;
	
	@Column(name="OUTSTANDING_AMOUNT")
	private int outstandingAmount;
	
	@Column(name="CREATED_TS")
	private Date createdTs;
}