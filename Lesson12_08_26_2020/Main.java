package Lesson12_08_26_2020;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Months months = Months.valueOf(sc.nextLine());

        Months[] months1 = months.values();
        for (Months today : months1) {

            //boolean calendar = true;


            switch (months) {
                case JANUARY: {
                    System.out.println("JANUARY");
                    break;
                }
                case FEBRUARY: {
                    System.out.println("FEBRUARY");
                    break;
                }
                case MARCH: {
                    System.out.println("MARCH");
                    break;
                }
                case APRIL: {
                    System.out.println("APRIL");
                    break;
                }
                case MAY: {
                    System.out.println("MAY");
                    break;
                }
                case JUNE: {
                    System.out.println("JUNE");
                    break;
                }
                case JULY: {
                    System.out.println("JULY");
                    break;
                }
                case AUGUST: {
                    System.out.println("AUGUST");
                    break;
                }
                case SEPTEMBER: {
                    System.out.println("SEPTEMBER");
                    break;
                }
                case OCTOBER: {
                    System.out.println("OCTOBER");
                    break;
                }
                case NOVEMBER: {
                    System.out.println("NOVEMBER");
                    break;
                }
                case DECEMBER: {
                    System.out.println("DECEMBER");
                    break;
                }

                default: {
                    System.out.println("Такого месяца не существует!!");
                }

            }
            sc.close();
        }
    }

            // int maxMonth = 0;
            //for (Months m: Months.values()){
}
