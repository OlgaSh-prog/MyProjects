package Lesson12_08_26_2020;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Months [] months = Months.values();
        Seasons [] seasons = Seasons.values();

        boolean check = true;
        boolean work = true;
        String user = " ";
        String userChoice;

        while (check) {

            System.out.println("Enter your month: ");

            user = sc.nextLine();
            //Months months = Months.valueOf(user);

            for (int i = 0; i < Months.values().length; i++){

                if (months[i].name().equalsIgnoreCase(user)) {
                    user = months[i].name();
                    check = false;

                    System.out.println("The month " + Months.valueOf(user).toString() + " - Exist");
                }
            }
            if (check){
                System.out.println("The month " + user + " - Doesn't exist! Please, try again.");
            }
        }

        System.out.println("Select a number to see more information: \n");

            while (work) {
                System.out.println();
                System.out.println("Press 1 to display all months with the same season; ");
                System.out.println("Press 2 to display all months that have the same number of days; ");
                System.out.println("Press 3 to display all months that have minimum days;");
                System.out.println("Press 4 to display all months that have more days; ");
                System.out.println("Press 5 to display the next season of the year; ");
                System.out.println("Press 6 to display the previous season;");
                System.out.println("Press 7 to display all months that have an even number of days; ");
                System.out.println("Press 8 to display all months that have an odd number of days; ");
                System.out.println("Press 9 to Exit. ");

                String operation = sc.next();

                switch (operation) {
                    case "1": {
                        System.out.println("Display all months with the same season. ");

                        for (int i = 0; i <months.length ; i++) {

                            if(months[i].getSeason().equals(Months.valueOf(user).getSeason())){
                                System.out.println(months[i].name());
                            }
                        }
                        break;
                    }
                    case "2": {
                        System.out.println("Display all months that have the same number of days.  ");

                        for (int i = 0; i <months.length ; i++) {

                            if(months[i].getDays()==(Months.valueOf(user).getDays())){
                                System.out.println(months[i].name() + " " + months[i].getDays());
                            }
                        }
                        break;
                    }
                    case "3": {
                        System.out.println("Display all months that have minimum days. ");
                        for (int i = 0; i < months.length; i++) {

                            if(months[i].getDays()<(Months.valueOf(user).getDays())){
                                System.out.println(months[i].name() + " " + months[i].getDays());
                            }

                            else if (months[i].getDays()==(Months.valueOf(user).getDays())){
                                System.out.println("There are no months that contain minimum days.");
                            }
                        }

                        break;
                    }
                    case "4": {
                        System.out.println("Display all months that have more days. ");

                        for (int i = 0; i < months.length; i++) {

                            if(months[i].getDays()>(Months.valueOf(user).getDays())){
                                System.out.println(months[i].name() + " " + months[i].getDays());
                            }

                            else if (months[i].getDays()==(Months.valueOf(user).getDays())){
                                System.out.println("There are no months that contain more days.");
                            break;
                            }
                        }
                        break;
                    }
                    case "5": {
                        System.out.println("Display the next season of the year. ");

                        for (int i = 0; i < seasons.length ; i++) {

                            if(seasons[i].equals(Months.valueOf(user.toUpperCase()).getSeason())){
                                System.out.println("This season is: " + Months.valueOf(user.toUpperCase()).getSeason());
                                if (i == 3) {
                                    System.out.println("Next season is: " + seasons[0]);
                                } else {
                                    System.out.println("Next season is: " + seasons[i + 1]);
                                }
                            }
                        }
                        break;
                    }
                    case "6": {
                        System.out.println("Display the previous season. ");
                        for (int i = 0; i < seasons.length ; i++) {

                            if (seasons[i].equals(Months.valueOf(user.toUpperCase()).getSeason())) {
                                System.out.println("This season is: " + Months.valueOf(user.toUpperCase()).getSeason());
                                if (i == 0) {
                                    System.out.println("Previous season is: " + seasons[3]);
                                } else {
                                    System.out.println("Previous season is: " + seasons[i - 1]);
                                }
                            }
                        }
                        break;
                    }
                    case "7": {
                        System.out.println("Display all months that have an even number of days. ");
                        for (int i = 0; i < months.length ; i++) {

                            if(months[i].getDays() % 2 == 0){
                                System.out.println(months[i].toString());
                            }
                        }
                        break;
                    }
                    case "8": {
                        System.out.println("Display all months that have an odd number of days. ");
                        for (int i = 0; i <months.length ; i++) {

                            if(months[i].getDays() % 2 != 0){
                                System.out.println(months[i].toString());
                            }
                        }
                        break;
                    }
                    case "9": {
                        System.out.println("You have exited the menu. ");
                        work = false;
                        break;
                    }
                    default: {
                        System.out.println("We don't know this type of operation. Please try again! ");
                    }
                }
            }
            sc.close();
        }
    }