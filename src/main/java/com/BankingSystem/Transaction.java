package com.BankingSystem;

import java.util.Date;

public class Transaction {

	private int transactionId;
	private TransactionType type;
	private double amount;
	private Date date;
	private Account sourceAccount;
	private Account targetAccount;

}