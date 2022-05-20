package com.weshopify.feature.customers.autowire;

import java.io.Serializable;

public class HomeLoanAccount implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String loanNumber;
	private long loanAmount;
	public HomeLoanAccount() {
		// TODO Auto-generated constructor stub
	}
	public String getLoanNumber() {
		return loanNumber;
	}
	public void setLoanNumber(String loanNumber) {
		this.loanNumber = loanNumber;
	}
	public long getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(long loanAmount) {
		this.loanAmount = loanAmount;
	}
}
