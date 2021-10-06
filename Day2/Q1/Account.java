package com.hsbc.exercise;

public class Account {
	private long accountNumber;
	private double balance;
	private String ifsc;
	
	public Account(long accountNumber, double balance, String ifsc) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.ifsc = ifsc;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public String getIfsc() {
		return ifsc;
	}
//only getters so that user cannot change these props manually

	
	public String display() {
		StringBuilder builder = new StringBuilder();
		builder.append("Account [accountNumber=");
		builder.append(accountNumber);
		builder.append(", balance=");
		builder.append(balance);
		builder.append(", ifsc=");
		builder.append(ifsc);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	

}
