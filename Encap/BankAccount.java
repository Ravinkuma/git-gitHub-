package com.oops.Encap;

public class BankAccount {
   
	//Encapsulation in Java is the mechanism of wrapping the data (attributes) and methods (behaviors) 
	//within a class. 
	
	//It restricts direct access to the data and allows access only through methods.
	
	//Encapsulation helps in achieving data hiding, abstraction, and modularity(divide into separate 
	// functional unit).
    
	private String accountNumber;
    private double balance;
    private String ownerName;
	public BankAccount(String accountNumber, double balance, String ownerName) {
		//super();  why generate it?
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.ownerName = ownerName;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
    
	public double deposit(double amount) {
		balance=balance+amount;
		//return balance;
		return amount;
	}
     public double withdraw(double amount) {
    	 if(balance>=amount) {
    		 balance=balance-amount;
    	 return amount;
    	 }
    	 else {
    		 return 0; // return type void and print "insufficient balance " not here because double
    		           // is return type.
    	 }
     }
     public double checkBalance() {
    	 return balance;
     }
}
