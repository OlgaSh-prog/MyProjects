package Lesson8_07_18_2020;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        System.out.println("Finding the area S and perimeter P of the rectangle: ");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the area of the rectangle: ");
        int width = scanner.nextInt();

        System.out.println("Enter the perimeter of the rectangle: ");
        int length = scanner.nextInt();

        System.out.println("Width = " + width);
        System.out.println("Length = " + length);

        Rectangle rect = new Rectangle(width,length);
        rect.S();
        rect.P();
    }
}

