package exercise1.program;

import java.util.Scanner;

import exercise1.entities.Account;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.println("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter account holder: ");
		String name = sc.nextLine();
		
		System.out.println("Is there a initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		
		if (response == 'y') {
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, name, initialDeposit);
;		}
		else {
			account = new Account(number, name);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		
		System.out.print("Updated account data:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdrawn value: ");
		double withdrawnValue = sc.nextDouble();
		account.withdrawn(withdrawnValue);
		
		System.out.print("Updated account data:");
		System.out.println(account);
		
		sc.close();
	}
}
