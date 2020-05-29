package MyHomeProjectPackage;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = 1000;

        boolean work = true;

        System.out.println("HELLO! CHOOSE WHAT YOU WOULD LIKE TO DO TODAY!");

        while(work){

            System.out.println("Press 1 to show your balance.");
            System.out.println("Press 2 to withdraw money.");
            System.out.println("Press 3 to make a deposit to your account.");
            System.out.println("Press 4 for Exit.");

            String operation = sc.next();

            switch (operation){
                case "1":{
                    System.out.println("Your current balance is: " + balance + "\n");
                    break;
                }

                case "2":{
                    System.out.println("How much do you want to withdraw?");
                    int withdraw = sc.nextInt();
                    if (withdraw <= 0 || withdraw > balance){
                        System.out.println("An Error Has Occurred! You don’t have enough funds to withdraw a money.");
                        System.out.println("Your current balance is: " + balance + "\n");
                    }
                    else {
                        balance -= withdraw;
                        System.out.println("Withdrawn: -" + withdraw);
                        System.out.println("Your current balance is: " + balance + "\n");
                    }
                    break;
                }
                case "3":{
                    System.out.println("How much money do you want to put on your account?");
                    int deposit = sc.nextInt();
                    if (deposit <= 0){
                        System.out.println("An Error Has Occurred! Incorrect value. Please try again!");
                    }
                    else {
                        balance += deposit;
                    }
                    System.out.println("Deposited: " + deposit);
                    System.out.println("Your current balance is: " + balance + "\n");
                    break;
                }
                case "4":{
                    System.out.println("Thank's for using our ATM! Goodbye!");
                    work = false;
                    break;
                }
                default:{
                    System.out.println("We don't know this type of operation. Please try again! ");
                }
            }
        }
        sc.close();
    }
}

