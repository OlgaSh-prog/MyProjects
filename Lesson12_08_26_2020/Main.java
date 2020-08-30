package Lesson12_08_26_2020;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose your month: ");
        Months months = Months.valueOf(sc.nextLine());




       // Met met = new Met();
        //String month = met.monthExist(sc.nextLine());
        //Months months = Months.valueOf(month);

      //  months.monthExist(month);


            switch (months) {
                case JANUARY: {
                    System.out.println("You have chosen JANUARY! ");

                    break;
                }
                case FEBRUARY: {
                    System.out.println("You have chosen FEBRUARY! ");
                    break;
                }
                case MARCH: {
                    System.out.println("You have chosen MARCH! ");
                    break;
                }
                case APRIL: {
                    System.out.println("You have chosen APRIL! ");
                    break;
                }
                case MAY: {
                    System.out.println("You have chosen MAY! ");
                    break;
                }
                case JUNE: {
                    System.out.println("You have chosen JUNE! ");
                    break;
                }
                case JULY: {
                    System.out.println("You have chosen JULY! ");
                    break;
                }
                case AUGUST: {
                    System.out.println("You have chosen AUGUST! ");
                    break;
                }
                case SEPTEMBER: {
                    System.out.println("You have chosen SEPTEMBER! ");
                    break;
                }
                case OCTOBER: {
                    System.out.println("You have chosen OCTOBER! ");
                    break;
                }
                case NOVEMBER: {
                    System.out.println("You have chosen NOVEMBER! ");
                    break;
                }
                case DECEMBER: {
                    System.out.println("You have chosen DECEMBER! ");
                    break;
                }
            }sc.close();

        //System.out.println("Такого месяца не существует!!");
    }
}

            // int maxMonth = 0;
            //for (Months m: Months.values()){
