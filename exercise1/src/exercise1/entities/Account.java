package exercise1.entities;

public class Account {	
	private int number;
	private String name;
	private double balance;
	
	public int getNumber() {
		return number;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	public Account(int number, String name, double balance) {
		super();
		this.number = number;
		this.name = name;
		this.balance = balance;
	}
	
	public Account(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Account " + number + ", Holder: " + name + ", Balance: $ " + balance + "\n";
	}
	
	
}
