package com.oops.Encap;

public class MainBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount cus1=new BankAccount("1600001800102218",55225.63,"Sumit");
		System.out.println("Account number: "+cus1.getAccountNumber());
		System.out.println("Account balance: "+cus1.getBalance());
		System.out.println("Account holder name: "+cus1.getOwnerName());
		cus1.deposit(15000);
		cus1.withdraw(20000);
		//cus1.checkBalance();
		System.out.println("Reamining balance: "+ String.format("%.2f",cus1.checkBalance())+"\n");
		// customer2
		BankAccount cus2=new BankAccount("1600001800102221",57225.63,"Amit");
		System.out.println("Account number: "+cus2.getAccountNumber());
		System.out.println("Account balance: "+cus2.getBalance());
		System.out.println("Account holder name: "+cus2.getOwnerName());
		cus2.deposit(15000);
		cus2.withdraw(20000);
		//cus2.checkBalance();
		System.out.println("Reamining balance: "+ String.format("%.2f",cus2.checkBalance()));

	}

}
