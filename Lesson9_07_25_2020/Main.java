package Lesson9_07_25_2020;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Human <1>: ");
        System.out.println("Put name: ");
        String name = scanner.next();

        System.out.println("Chose type: ");

        System.out.println("1: Picker");
        System.out.println("2: Hunter");

        String type = scanner.next();

        switch (type) {
            case "1": {
                type = "Picker";
                break;
            }

            case "2": {
                type = "Hunter";
                break;
            }
        }

        System.out.println("Put age: ");
        int age = scanner.nextInt();

        Human human = new Human(name,type,age); // First human
        System.out.println("1 - " + human + "\n");

        System.out.println("Human <2>: ");
        System.out.println("Put name: ");
        name = scanner.next();

        System.out.println("Chose type: ");

        System.out.println("1: Picker");
        System.out.println("2: Hunter");

        type = scanner.next();

        switch (type) {
            case "1": {
                type = "Picker";
                break;
            }

            case "2": {
                type = "Hunter";
                break;
            }
        }

        System.out.println("Put age: ");
        age = scanner.nextInt();

        Human human2 = new Human(name,type,age); //Second human

        System.out.println("1 - " + human);
        System.out.println("2 - " + human2);

        System.out.println();

        System.out.println("Chose human: ");
        int user = scanner.nextInt();

        System.out.println();

        String food;
        if (user == 1) {
            System.out.println("You chose: ");
            System.out.println(human);

            System.out.println("His menu is: ");
            human.getMenu();
            System.out.println("\n" + "Chose your meal by food name: ");

            food = scanner.next();
            human.eat(food);

        }
        else if (user == 2) {
            System.out.println("You chose: ");
            System.out.println(human2);

            System.out.println("His menu is: ");
            human2.getMenu();
            System.out.println("\n" + "Chose your meal by food name: ");

            food = scanner.next();
            human2.eat(food);
        }

    }

}