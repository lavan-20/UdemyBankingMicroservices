package com.udemy.accounts.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Accounts {
	
	@Id
	@Column(name = "CUSTOMER_ID")
	private int customerId;
	
	@Column(name = "ACCOUNT_NO")
	private long accountNumber;
	
	@Column(name = "ACCOUNT_TYPE")
	private String accountType;
	
	@Column(name = "BRANCH_ADDRESS")
	private String branchAddress;
	
	@Column(name = "CREATED_TS")
	private Date createdTs;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getBranchAddress() {
		return branchAddress;
	}

	public void setBranchAddress(String branchAddress) {
		this.branchAddress = branchAddress;
	}

	public Date getCreatedTs() {
		return createdTs;
	}

	public void setCreatedTs(Date createdTs) {
		this.createdTs = createdTs;
	}
	
	
}
