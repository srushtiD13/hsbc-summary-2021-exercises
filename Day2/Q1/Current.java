package com.hsbc.exercise;

public class Current extends Account {
	
	private String nomineeName;

	public Current(long accountNumber, double balance, String ifsc, String nomineeName) {
		super(accountNumber, balance, ifsc);
		this.nomineeName = nomineeName;
	}

	public String getNomineeName() {
		return nomineeName;
	}

	public void setNomineeName(String nomineeName) {
		this.nomineeName = nomineeName;
	}//nominee name can be changed later
	
	@Override
	public String display() {
		StringBuilder builder = new StringBuilder();
		builder.append("Current Account [accountNumber=");
		builder.append(super.getAccountNumber());
		builder.append(", balance=");
		builder.append(super.getBalance());
		builder.append(", ifsc=");
		builder.append(super.getIfsc());
		builder.append(", Nominee Name=");
		builder.append(nomineeName);
		builder.append("]");
		
		
		return builder.toString();
	}
	
	

}
