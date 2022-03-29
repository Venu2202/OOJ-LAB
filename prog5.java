package com.company;
import java.util.*;
class Account
{
    String customer_name;
    int account_no;
    String type_acc;
    double balance;

    Scanner si = new Scanner(System.in);
    void input()
    {
        System.out.println("Enter the name: ");
        customer_name=si.next();
        System.out.println("Enter the Account number: ");
        account_no=si.nextInt();
        System.out.println("Enter Balance amount: ");
        balance=si.nextDouble();
    }
}
class CurrAcc extends Account
{
    double amount;
    Scanner s = new Scanner(System.in);
    public void deposit()
    {
        System.out.println("Enter the amount to Deposit:");
        amount = s.nextDouble();
        balance = balance + amount;

        System.out.println("Balance: " + balance);
    }
    public void withdraw()
    {
        System.out.println("Enter amount for withdrawal: ");
        amount = s.nextInt();
        balance = balance - amount;

        System.out.println("Balance: " + balance);
    }
    public void min_bal()
    {
        if(balance<1000)
        {
            double penalty=118;

            balance = balance - penalty;
            System.out.println("Minimum balance not maintaned: ");
            System.out.println("Penalty: 118");
            System.out.println("Balance: " + balance);
        }
    }
}
class SavAcc extends Account
{

    double amount;
    Scanner s = new Scanner(System.in);
    public void deposit()
    {
        System.out.println("Enter the amount to Deposit:");
        amount = s.nextDouble();
        balance = balance + amount;

        System.out.println("Balance: " + balance);
    }
    public void withdraw()
    {
        System.out.println("Enter amount for withdrawal: ");
        amount = s.nextInt();
        balance = balance - amount;
        System.out.println("Balance: " + balance);

    }

    public void min_bal()
    {
        if(balance<1000)
        {
            double penalty=118;

            System.out.println("Minimum balance not maintaned: ");
            System.out.println("Penalty: 118");
            balance = balance - penalty;
            System.out.println("Balance: " + balance);
        }
    }
    public void interest()
    {
        int rate=15;
        int time=2;
        double si;

        si=(balance*rate*time)/100;
        System.out.println("Interest Calculated is: " + si);
        balance = balance + si;
        System.out.println("Balance: " + balance);
    }
}
public class prog5
{
    public static void main(String[] args)
    {
        int ch;
        int option;
        CurrAcc c = new CurrAcc();
        SavAcc s = new SavAcc();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the type of Account: ");
        System.out.println("1. Savings Account \n2. Current Account");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                s.input();
                System.out.println("1. Deposit \n2. Withdraw \n3. Interest \n4. Exit");
                option=sc.nextInt();
                switch(option)
                {
                    case 1:
                        s.deposit();
                        break;
                    case 2:
                        s.withdraw();
                        break;
                    case 3:
                        s.interest();
                    case 4:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice");
                        break;
                }
                s.min_bal();
                break;
            case 2:
                c.input();
                System.out.println("1. Deposit \n2. Withdraw  \n3. Exit");
                option=sc.nextInt();
                switch(option)
                {
                    case 1:
                        c.deposit();
                        break;
                    case 2:
                        c.withdraw();
                        break;
                    case 4:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice");
                        break;
                }
                c.min_bal();
        }
        if(ch==1)
            System.out.println("Check book facility is not available");
        else if(ch==2)
            System.out.println("Check book facility is available");
    }
}






