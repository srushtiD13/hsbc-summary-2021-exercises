package com.hsbc.exercise;

public class Savings extends Account {
	private double dailylimit;

	public Savings(long accountNumber, double balance, String ifsc, double dailylimit) {
		super(accountNumber, balance, ifsc);
		this.dailylimit = dailylimit;
	}

	public double getDailylimit() {
		return dailylimit;
	}

	@Override
	public String display() {
		StringBuilder builder = new StringBuilder();
		builder.append(" Savings Account [accountNumber=");
		builder.append(super.getAccountNumber());
		builder.append(", balance=");
		builder.append(super.getBalance());
		builder.append(", ifsc=");
		builder.append(super.getIfsc());
		builder.append(", dailylimit=");
		builder.append(dailylimit);
		builder.append("]");
		
		
		return builder.toString();
	}

	
	

}
