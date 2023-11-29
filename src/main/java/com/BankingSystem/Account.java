package com.BankingSystem;

import java.util.List;

public class Account {

	private int accountId;
	private String accountNumber;
	private double balance;
	private boolean isOpen;
	private Customer customer;
	private List transactions;
	private AccountType type;

	/**
	 * 
	 * @param amount
	 */
	public void deposit(double amount) {
		// TODO - implement Account.deposit
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param amount
	 */
	public boolean withdraw(double amount) {
		// TODO - implement Account.withdraw
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param amount
	 * @param targetAccount
	 */
	public boolean transfer(double amount, Account targetAccount) {
		// TODO - implement Account.transfer
		throw new UnsupportedOperationException();
	}

	public double getBalance() {
		return this.balance;
	}

	/**
	 * 
	 * @param transaction
	 */
	public void addTransaction(Transaction transaction) {
		// TODO - implement Account.addTransaction
		throw new UnsupportedOperationException();
	}

}