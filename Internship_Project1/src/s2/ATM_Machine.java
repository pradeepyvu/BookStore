package s2;

import java.util.Scanner;

class ATM{
	float balance;
	int PIN=7336;
	public void checkpin() {
		System.out.println("Enter your pin");
		Scanner sc=new Scanner(System.in);
		int enteredpin=sc.nextInt();	
		if(enteredpin==PIN) {
			menu();
		}
		else {
			System.out.println("Enter a valid pin");
		}
		}
	public void menu() {
		System.out.println("Enter Your Choice");
		System.out.println("1. Check A/C Balance");
		System.out.println("2. Withdraw Money");
		System.out.println("3. Deposit Money");
		System.out.println("4.EXIT");
		
		Scanner sc=new Scanner(System.in);
		int option=sc.nextInt();
		
		if(option==1) {
			checkBalance();
		}
		else if(option==2) {
			withdrawMoney();
		}
		else if(option==3) {
			depositMoney();
		}
		else if(option==4) {
			return;
		}
		else {
			System.out.println("Enter a valid choice");
		}
	}
	
	public void checkBalance() {
		System.out.println("Balance:"+balance);
		menu();
	}
	
	public void withdrawMoney() {
		System.out.println("Enter Amount to Withdraw");
		Scanner sc=new Scanner(System.in);
		float amount=sc.nextFloat();
		if(amount>balance) {
			System.out.println("Insufficient Balance");
		}
		else {
			balance=balance-amount;
			System.out.println("Money Withdrawl Successful");
		}
		menu();
	}
	public void depositMoney() {
		System.out.println("Enter the Amount");
		Scanner sc=new Scanner(System.in);
		float amount=sc.nextFloat();
		balance=balance+amount;
		System.out.println("Money deposited successfully");
		menu();
	}
	public void Exit() {
		System.out.println("Process finished with exit code 0");
	}
}

public class ATM_Machine {
	public static void main(String[] args) {
		ATM obj=new ATM();
		obj.checkpin();
	}

}
