package week4;

import java.util.Scanner;

public class task18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year to check if it's a leap year: ");
        int year = input.nextInt();
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if (isLeapYear) {
System.out.println(year + " is a leap year with 366 days.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}