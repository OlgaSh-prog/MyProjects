package Lesson14_11_05_2020;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Commodity commodity = new Commodity();

        boolean menu = true;

        while (menu) {

            System.out.println("Choose <1> to add Item.");
            System.out.println("Choose <2> to delete Item.");
            System.out.println("Choose <3> to replace Item.");
            System.out.println("Choose <4> to show all Items.");
            System.out.println("Choose <5> to sort by Name.");
            System.out.println("Choose <6> to sort by Length.");
            System.out.println("Choose <7> to sort by Width.");
            System.out.println("Choose <8> to sort by Weight.");
            System.out.println("Choose <0> for Exit.");

            String work = sc.next();

            switch (work) {

                //Choose <1> to add Item.
                case "1": {
                    // Add Item
                    commodity.addItem();
                    System.out.println();
                    break;
                }

                //Choose <2> to delete Item.
                case "2": {
                    //Delete Item
                    commodity.deleteItem();
                    System.out.println();
                    break;
                }

                //Choose <3> to replace Item.
                case "3": {
                    commodity.replaceItem();
                    System.out.println();
                    break;
                }

                //Choose <4> to show all Items.
                case "4": {
                    //All Items
                    commodity.allItems();
                    System.out.println();
                    break;
                }

                //Choose <5> to sort by Name.
                case "5": {
                    //Sort by Name
                    commodity.sortByName();
                    System.out.println();
                    break;
                }

                //Choose <6> to sort by Length.
                case "6": {
                    //Sort by length
                    commodity.sortByLength();
                    System.out.println();
                    break;
                }

                //Choose <7> to sort by Width.
                case "7": {
                    //Sort by Width
                    commodity.sortByWidth();
                    System.out.println();
                    break;
                }

                //Choose <8> to sort by Weight.
                case "8": {
                    //Sort by Weight
                    commodity.sortByWeight();
                    System.out.println();
                    break;
                }

                //Choose <0> to Exit.
                case "0": {
                    menu = false;
                    break;
                }
                default: {
                    System.out.println("I don't know this type of operation. Please try again!");
                }
            }
        }
    }
}

//        Set<Commodity> item = new TreeSet<>();
//        System.out.println(item.add(new Commodity("lolo", 45, 22, 32)));
//        System.out.println(item.add(new Commodity("koko", 12, 37, 20)));
//        System.out.println(item.add(new Commodity("bobo", 28, 98, 65)));
//        System.out.println(item.add(new Commodity("vovo", 32, 56, 20)));
//        System.out.println(item.add(new Commodity("xoxo", 54, 14, 29)));
//
//        System.out.println();
//        System.out.println("Sorting items by Name: ");
//
//        for (Commodity commodity : item){
//            System.out.println(commodity);
//        }