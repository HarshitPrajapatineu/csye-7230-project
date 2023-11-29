package com.BankingSystem;

import java.util.List;

public class System {

	private List customers;
	private List accounts;
	private List transactions;
	private List atms;
	private List employees;
	private List branches;
	private List loans;
	private List creditCards;

	/**
	 * 
	 * @param transaction
	 */
	public boolean processTransaction(Transaction transaction) {
		// TODO - implement System.processTransaction
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param customer
	 * @param accountType
	 */
	public Account openAccountForCustomer(Customer customer, AccountType accountType) {
		// TODO - implement System.openAccountForCustomer
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param customer
	 * @param branch
	 */
	public void assignCustomerToBranch(Customer customer, Branch branch) {
		// TODO - implement System.assignCustomerToBranch
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param location
	 */
	public ATM createATM(String location) {
		// TODO - implement System.createATM
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param application
	 */
	public Loan approveLoan(LoanApplication application) {
		// TODO - implement System.approveLoan
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param customer
	 * @param creditLimit
	 */
	public CreditCard issueCreditCard(Customer customer, double creditLimit) {
		// TODO - implement System.issueCreditCard
		throw new UnsupportedOperationException();
	}

}