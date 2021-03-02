package ro.ase.csie.cts.g1094.laboratory.model;

public abstract class BankAccount extends Account{

	protected double balance;
	protected String iban;
	
	public BankAccount(String iban, double balance) {
		this.iban=iban;
		this.balance=balance;
	}



	@Override
	public Object getBalance() {
		return this.balance;
	}
	
	
}
