package com.tcs.bankapplication.controller;

import java.util.Scanner;

import com.tcs.bankapplication.service.RBI;
import com.tcs.bankapplication.serviceImpl.SBI;

public class AdminController {

	public static void main(String[] args) {

		System.out.println("welcome to SBI universe");
		
		Scanner sc = new  Scanner(System.in);
		
		boolean flag = true;
		
		RBI rbi = new SBI();
		
		while(flag) {
			
			System.out.println("1. create bank account       ");
			System.out.println("2. show account details      ");
			System.out.println("3.  show account balance   ");
			System.out.println("4. deposit                                ");
			System.out.println("5.withdraw                              ");
			System.out.println("6. update                                 ");
			System.out.println("7. exit                                       ");
			
			int ch = sc.nextInt();
			
			switch(ch) {
			
			case 1: 
				System.out.println("you have selected create account");
			    rbi.registerAccount();
			    break;
			    
			case 2:
				System.out.println("you have selected show account details");
				rbi.showAccountDetails();
				break;
				
			case 3:
				System.out.println("you have selected show account balance");
				rbi.showBalance();
				break;
				
			case 4:
				System.out.println("you have selected deposit");
				rbi.Deposit();
				break;
				
			case 5:
				System.out.println("you have selected withdraw");
				rbi.withdraw();
				break;
				
			case 6:
				System.out.println("you have selected update");
				rbi.UpdateAccountDetails();
				break;
				
			case 7:
				System.out.println("you have selected exit");
				flag = false;
				break;
				
			default :
					System.out.println("you have entered wrong choice ");
					break;
			}
			
//		
			
			System.out.println("thank you for banking.......................");
			
			
			}
		sc.close();
	}

}
