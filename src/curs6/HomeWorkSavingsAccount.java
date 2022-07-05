package curs6;

import javax.naming.InsufficientResourcesException;

public class HomeWorkSavingsAccount extends HomeWorkAccount {

	public HomeWorkSavingsAccount(String accountNumber, int balance, String accountOwner) {
		super(accountNumber, balance, accountOwner);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(int sum) throws InsufficientResourcesException {
		if(sum >= 200 ){
				throw new InsufficientResourcesException("Fonduri Insuficiente");
				
			} else {
				System.out.println("Sum ok");
			}		
			
		this.balance = this.balance - sum;
	}
		
}
