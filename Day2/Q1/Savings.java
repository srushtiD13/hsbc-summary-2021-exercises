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
		builder.append(" Savings Account");
		builder.append(super.display());
		builder.append(", dailylimit=");
		builder.append(dailylimit);
		
		
		return builder.toString();
	}

	
	

}
