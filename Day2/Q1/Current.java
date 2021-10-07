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
		builder.append("Current Account ");
		builder.append(super.display());
		builder.append(", Nominee Name=");
		builder.append(nomineeName);
	
		
		
		return builder.toString();
	}
	
	

}
