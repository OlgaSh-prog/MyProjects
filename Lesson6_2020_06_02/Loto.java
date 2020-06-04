package Lesson6_2020_06_02;

import java.util.Scanner;

public class Loto {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        int random = (int) (Math.random() * 15);

        //System.out.println("Number: " + random);
        System.out.println("Hello! Try to guess my number!");
        System.out.println("NOTE: You have only 4 attempts to guess the number!");

        int userNumber = number.nextInt();
        int att = 4;

        for (int i = 0; i <= 2; i++) {

            if (random > userNumber) {
                att--;
                System.out.println("\n" + "My number is bigger than yours! ");
                System.out.println("Attempts left! " + att);

                userNumber = number.nextInt();

            } else if (random < userNumber) {
                att--;
                System.out.println("\n" + "My number is less than yours! ");
                System.out.println("Attempts left: " + att);

                userNumber = number.nextInt();
            }
        }

        if (random != userNumber) {

            System.out.println("\n" + "Correct answer is: " + random);
            System.out.println("You have no more attempts! Try again!");

        } else {
            System.out.println("Congratulations! You Win!");
        }
    }
}

