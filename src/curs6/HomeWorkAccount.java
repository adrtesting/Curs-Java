package curs6;

import javax.naming.InsufficientResourcesException;

public class HomeWorkAccount {

	private String accountNumber;
	double balance = 0;
	public String accountOwner;
	
	public HomeWorkAccount(String accountNumber, int balance, String accountOwner) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.accountOwner = accountOwner;
	}


	public void withdraw (int sum) throws InsufficientResourcesException {
	
	
		if (sum >= 200) {
			throw new InsufficientResourcesException("Fonduri Insuficiente");
			
		} else {
			System.out.println("Sum ok");
		}		
	
	}
	
}	

	




