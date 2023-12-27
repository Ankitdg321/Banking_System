package com.tcs.bankapplication.serviceImpl;

import java.util.Scanner;

import com.tcs.bankapplication.model.Account;
import com.tcs.bankapplication.service.RBI;

public class SBI implements RBI {
	
	Scanner sc = new Scanner(System.in);
	
	Account ac = new Account();

	@Override
	public void registerAccount() {
		
		System.out.println("-------------------------------////-----enter account details---////-------------------------------");
		
		System.out.println("enter account number");
		int accNo = sc.nextInt();
		ac.setAccountNo(accNo);
		
		System.out.println("enter account holder name");
		String name= sc.next();
		ac.setAccountHolderName(name);
		
		System.out.println("enter address");
		String address= sc.next();
		ac.setAddress(address);
		
		System.out.println("enter aadhar no");
		String adhr= sc.next();
		ac.setAadharNo(adhr);
		
		System.out.println("enter pan no");
		String pan= sc.next();
		ac.setPanNo(pan);
		
		System.out.println("enter contact no");
	   long contno= sc.nextLong();
	    ac.setContactNo(contno);
	    
	    System.out.println("enter account balance");
	    double accbal =sc.nextDouble();
	    ac.setAccountBalance(accbal);
	}

	@Override
	public void showAccountDetails() {
		
		System.out.println(" enter your account no to display the details ");
		int accNo = sc.nextInt();
		
		if (ac.getAccountNo()==accNo) {
			
			System.out.println("your account no is  : "+ac.getAccountNo());
			System.out.println("your name is  : "+ac.getAccountHolderName());
			System.out.println("your account balanace is  : "+ac.getAccountBalance());
			System.out.println("your address is  : "+ac.getAddress());
			System.out.println("your contact no is  : "+ac.getContactNo());
			System.out.println("your pan no is  : "+ac.getPanNo());
			System.out.println("your aadhar no is  : "+ac.getAadharNo());
		}
		else {
			System.out.println("account does not exists .....plz recheck the account number");
		}
		
	}

	@Override
	public void showBalance() {

       System.out.println("enter account no");
       
       int accNo = sc.nextInt();
       
       if (ac.getAccountNo()==accNo) {
			
			System.out.println("your account balance is  : "+ac.getAccountBalance());
			
		}
		else {
			System.out.println("account does not exists .....plz recheck the account number");
		}
		
	}

	@Override
	public void withdraw() {

    System.out.println("enter the amount to withdraw ");
    
    double updatedBalance = ac.getAccountBalance() - sc.nextInt();
    ac.setAccountBalance(updatedBalance);
    
    System.out.println("the remaining amount in your account is :" + ac.getAccountBalance());
		
	}

	@Override
	public void Deposit() {
		
		System.out.println("enter the amount to deposit ");
		
		double  updateBalance = ac.getAccountBalance() + sc.nextInt();
		ac.setAccountBalance(updateBalance);
		
		System.out.println("youe new balace is :" + ac.getAccountBalance());
		
		
	}

	@Override
	public void UpdateAccountDetails() {
		
		System.out.println("enter your choice for updation");
		System.out.println("1.Address 2. AadharNo  3.PanNo 4. ContactNo");
		
		
		int choice = sc.nextInt();
		switch(choice) {
		 
		case 1:
			System.out.println("enter new address");
			String newAddress = sc.next();
			ac.setAddress(newAddress);
			
			System.out.println("you have updated adress");
			break;
			
		case 2:
			System.out.println("enter new aadhar no");
			String newAadhar = sc.next();
			ac.setAadharNo(newAadhar);
			System.out.println("you have updated aadhar no");
			break;
			
		case 3:
			System.out.println("enter new pan no");
			String newPan = sc.next();
			ac.setPanNo(newPan);
			System.out.println("you have updated pan no");
			break;
			
		case 4:
			System.out.println("enter new contact no");
			long newContact= sc.nextLong();
			ac.setContactNo(newContact);
			System.out.println("you have updated contact");
			break;
			
		}
		
		System.out.println("**********updated*********");
	}

}
