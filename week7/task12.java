package week7;

import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter full year (e.g., 2012): ");
        int year = input.nextInt();
        System.out.print("Enter month as number between 1 and 12: ");
        int month = input.nextInt();

        printMonth(year, month);
    }

    public static void printMonth(int year, int month) {
        String monthName = getMonthName(month);
        int startDay = getStartDay(year, month);
        int numberOfDays = getNumOfDaysInMonth(year, month);

        printMonthTitle(monthName, numberOfDays, startDay);
        printMonthBody(numberOfDays, startDay);
    }

    public static void printMonthTitle(String monthName, int numberOfDays, int startDay) {
        System.out.println(monthName + " " + numberOfDays + " " + getNumOfDaysInMonth(2000, 1));
    }

    public static void printMonthBody(int numberOfDays, int startDay) {
        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }
        for (int i = 1; i <= numberOfDays; i++) {
            System.out.printf("%4d", i);
            if ((i + startDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static String getMonthName(int month) {
        String[] monthNames = {"January", "February", "March", "April", "May", "June",
                                "July", "August", "September", "October", "November", "December"};
        return monthNames[month - 1];
    }

    public static int getStartDay(int year, int month) {
        int[] dayOfMonths = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] dayOfMonthsLeapYear = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int day = 0;
        for (int i = 1; i < month; i++) {
            if (isLeapYear(year)) {
                day += dayOfMonthsLeapYear[i];
            } else {
                day += dayOfMonths[i];
            }
        }
        int dayOfWeek = (day + 1 + (year - 2000) / 4 - (year - 2000) / 100 + (year - 2000) / 400) % 7;
        return (dayOfWeek + 6) % 7 + 1;
    }

    public static int getNumOfDaysInMonth(int year, int month) {
        int[] dayOfMonths = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return dayOfMonths[month];
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}