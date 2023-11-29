package com.BankingSystem;

import java.util.List;

public class Customer {

	private int customerId;
	private String name;
	private String address;
	private String phoneNumber;
	private String email;
	private List accounts;
	private Branch branch;
	private List loans;
	private List creditCards;

	/**
	 * 
	 * @param accountType
	 */
	public Account createAccount(AccountType accountType) {
		// TODO - implement Customer.createAccount
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param account
	 */
	public boolean closeAccount(Account account) {
		// TODO - implement Customer.closeAccount
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param account
	 */
	public double viewBalance(Account account) {
		// TODO - implement Customer.viewBalance
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param account
	 */
	public List viewTransactionHistory(Account account) {
		// TODO - implement Customer.viewTransactionHistory
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param loanAmount
	 */
	public LoanApplication applyForLoan(double loanAmount) {
		// TODO - implement Customer.applyForLoan
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param creditLimit
	 */
	public CreditCard applyForCreditCard(double creditLimit) {
		// TODO - implement Customer.applyForCreditCard
		throw new UnsupportedOperationException();
	}

}