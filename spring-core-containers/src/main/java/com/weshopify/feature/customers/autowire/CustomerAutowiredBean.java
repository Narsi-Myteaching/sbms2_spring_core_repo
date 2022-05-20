package com.weshopify.feature.customers.autowire;

import java.io.Serializable;

public class CustomerAutowiredBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4626408313006044324L;
	private HomeLoanAccount homeLoanAccount;

	public void setHomeLoanAccount(HomeLoanAccount homeLoanAccount) {
		this.homeLoanAccount = homeLoanAccount;
	}

	public HomeLoanAccount getHomeLoanAccount() {
		return homeLoanAccount;
	}
}
