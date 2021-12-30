package pl.ppyrczak;

import java.util.Scanner;

public class Account {
    private int balance;
    private int withdrawal;
    private String name;
    private String idCustomer;

    public String getName() {
        return name;
    }

    public Account(String name, String idCustomer, int balance) {
        this.name = name;
        this.idCustomer = idCustomer;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public int howMuchWithdrawal() {
        System.out.println("How much deposit have you got?");
        Scanner scanner = new Scanner(System.in);
        int deposit = scanner.nextInt();
        if (deposit <= balance) {
            withdrawal = (int) ((deposit*61*0.03/365));
            System.out.println("Your withdrawal is: " + withdrawal + "$");
        }   else {
            System.out.println("You have no money to have withdrawal !!!!");
        }

        return withdrawal;

    }

    public int checkBalance() {
        System.out.println("Your balance is: " + getBalance() + "$");
        return getBalance();
    }

    public int getMoney() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How money do you want to get? ");
        int money = scanner.nextInt();
        if (money <= balance) {
            balance -= money;
            System.out.println("Your balance now is: " + balance + "$");
        }
        else {
            System.out.println("The balance is too low");
        }
        return balance;
    }

    public int leaveMoney() {
        System.out.println("How much money do you want to leave?");
        Scanner scanner = new Scanner(System.in);
        int money = scanner.nextInt();
        balance += money;
        System.out.println("Your balance now is: " + balance + "$");
        return balance;
    }

    void showMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("What do you want to do?");
            System.out.println("1 - balance");
            System.out.println("2 - withdrawal");
            System.out.println("3 - get money");
            System.out.println("4 - leave money");
            System.out.println("5 - exit");
            int number = scanner.nextInt();
            switch (number) {
                case 1: {
                    checkBalance();
                    break;
                }

                case 2: {
                    howMuchWithdrawal();
                    break;
                }

                case 3: {
                    getMoney();
                    break;
                }

                case 4: {
                    leaveMoney();
                    break;
                }

                case 5: {
                    System.out.println("GOODBYE");
                    return;
                }
            }
        }
    }
}
