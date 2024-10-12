package week4;

import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        if (number % 5 == 0) {
            System.out.println("HiFive");
        } else if (number % 2 == 0) {
            System.out.println("HiEven");
        } else {
            System.out.println("Neither HiFive nor HiEven");
        }
    }
}