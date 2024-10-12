package week4;

import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the cost: ");
        double cost = scanner.nextDouble();
        final double SALES_TAX_RATE = 0.06; 
        double taxAmount = cost * SALES_TAX_RATE;
        System.out.printf("The tax amount is: %.2f", taxAmount);
    }
}