package com.demo;
 
import java.util.Scanner;

class BankAccountDetails 
{
    private double balance;

    public BankAccountDetails(double IB)
    {
        balance = IB;    //initial balance (IB)
    }
 public double getBalanceAmount() 
    {
        return balance;
    }

    public void depositAmount(double amount)
    {
        balance = balance + amount;  //To check amount after deposit
    }
public boolean withdrawAmount(double amount)  
    {
        if (amount <= balance)  
        {
               balance -= amount; //To check amount after withdrawal
            return true;
        } 
        else 
        {
             return false;
        }
    }
}

class ATM 
{
    private BankAccountDetails account;

    public ATM(BankAccountDetails account) 
    {
        this.account = account;
    }

    public void displayMenuOption()
    {
        System.out.println("Welcome to the ATM...!");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }
  public void PT()
  {
        Scanner sc = new Scanner(System.in);
        int choice;
        double amount;

        while (true)
        {
            displayMenuOption();
            System.out.print("Enter your choice:- ");
            choice = sc.nextInt();

            switch (choice) 
            {
                case 1:
                    System.out.println("Your balance is: Rs. " + account.getBalanceAmount());
                    break;
                case 2:
                    System.out.print("Enter the deposit amount: Rs. ");
                    amount = sc.nextDouble();
                    if (amount > 0)
                    {
                        account.depositAmount(amount);
                        System.out.println("***...Deposit successful...***");
                    } else 
                    {
                        System.out.println("Invalid deposit amount.");
                    }
                    break;
                case 3:
                    System.out.print("Enter the withdrawal amount: Rs. ");
                    amount = sc.nextDouble();
                    if (amount > 0 && account.withdrawAmount(amount)) {
                        System.out.println("***...Withdrawal successful...***");
                    } 
                    else 
                    {
                        System.out.println("Invalid withdrawal amount or insufficient balance.");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM.. Goodbye..!");
                    return;
                default:
                    System.out.println("Invalid choice... Please try again...!");
            }
        }
    }
}


public class ATM_Interface 
{
    public static void main(String[] args)
    {
        BankAccountDetails userAccount = new BankAccountDetails(500000); 
        ATM atm = new ATM(userAccount);
        atm.PT();
    }
}