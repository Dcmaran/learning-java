package exercise1.tela;

import java.util.Scanner;

import exercise1.entities.Account;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter account holder: ");
		String name = sc.nextLine();
		
		System.out.println("Is there a initial deposit (y/n)? ");
		
		String deposit_type = sc.nextLine();
		
		if (deposit_type.equals("y")) {
			System.out.println("Enter initial deposit value: ");
			double initial_deposit = sc.nextDouble();
			Account account = new Account(number, name, initial_deposit);
			System.out.println(account);
			
			System.out.println("Enter a deposit value: ");
			double deposit = sc.nextDouble();
			account.setBalance(deposit + initial_deposit);
			
			System.out.println("Account data:\n");
			System.out.println(account);
			
			System.out.println("Enter a withdraw value: ");
			double withdrawn = sc.nextDouble();
			
			System.out.println("Account data:\n");
			System.out.println(account);
			
			double balance = account.getBalance();
			account.setBalance(balance - withdrawn - 5);
			
			System.out.println("Account data:\n");
			System.out.println(account);
			
		} else {
			Account account = new Account(number, name);
			System.out.println("\nAccount data:");
			System.out.println(account);
			
			System.out.println("Enter a deposit value: ");
			double deposit = sc.nextDouble();
			account.setBalance(deposit);
			
			System.out.println("\nUpdated Account data:");
			System.out.println(account);
			
			System.out.println("Enter a withdraw value: ");
			double withdrawn = sc.nextDouble();
			account.setBalance(deposit - withdrawn - 5);
			
			System.out.println("\nUpdated Account data:");
			System.out.println(account);
			
		}
		
	}
}
