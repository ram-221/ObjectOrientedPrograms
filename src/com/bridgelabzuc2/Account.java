package com.bridgelabzuc2;

import java.util.Scanner;

public class Account {

	final static int ACCOUNT_BALANCE =5000;
	
	public void debit() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Money you want withdraw");
		int withdrawAmount=scan.nextInt();
		
		if(withdrawAmount < ACCOUNT_BALANCE) {
			int remainingBalance = ACCOUNT_BALANCE - withdrawAmount;
			System.out.println("Remaining Money in your  Amount "+remainingBalance);
		}
		else {
			System.out.println("Debit amount exceeded Account Balance");
			System.out.println("Your Account Balance is "+ACCOUNT_BALANCE);
		}
		scan.close();
	}
	public static void main(String[] args) {
		Account account = new Account();
		account.debit();
	}
}
