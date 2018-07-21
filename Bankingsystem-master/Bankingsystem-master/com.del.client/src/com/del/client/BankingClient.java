package com.del.client;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.del.exception.BankingException;
import com.del.service.BankingService;
import com.del.service.BankingServiceImpl;

public class BankingClient {
	private BankingService bService;

	public BankingClient()  {
		bService=new BankingServiceImpl();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter username:");
		String login=scan.nextLine();
		System.out.println("Enter password:");
		String password=scan.nextLine();
		boolean loginsuccess=bService.authenticate(login,password);
		if(loginsuccess)
		{int choice=0;
		while(true) {
			choice=getChoice(scan);
		switch (choice) {
		case 1:
			System.out.println("Deposit Amount");
			System.out.println("Enter amount to be diposited");
			double amount= scan.nextDouble();
			try {
				bService.depositAmount(amount);
			} catch (BankingException e) {
				
				System.out.println(e.getMessage());
			}
			System.out.println("Deposited amount: "+amount);
			break;
        case 2:
        	System.out.println("Withdraw Amount");
        	System.out.println("Enter amount to be withdrawn");
			double amount1= scan.nextDouble();
			try {
				bService.withdrawAmount(amount1);
			} catch (BankingException e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Withdrawn amount: "+amount1);
			
			break;
        case 3:
        	System.out.println("Check Balance");
        	double balance=bService.getbalance();
        	System.out.println("Your current balance: "+balance);
	        break;
        case 4:
        	System.out.println("Exiting BANKING SYSTEM");
        	System.out.println("THANK YOU FOR USING OUR SERVICE");
        	System.exit(0);
	        break;

		default:
			System.out.println("Enter the correct choice");
			break;
		}
		}
		
	}else
		System.out.println("Either login or password is wrong");
	}
	private int getChoice(Scanner scan) {
		int choice=0;
		System.out.println("WELCOME TO XYZ BANKING SYSTEM");
		System.out.println("1.Deposit Amount");
		System.out.println("2.Withdraw Amount");
		System.out.println("3.Check balance");
		System.out.println("4.Quit Program");
		System.out.println("Enter a choice 1-4");
		try {
		choice=scan.nextInt();}
		catch(InputMismatchException e)
		{System.out.println("Please enter numbers only");
		scan.nextLine();}
		
		return choice;
	}
	public static void main(String[] args) throws BankingException {
		new BankingClient();
	

	}

}
