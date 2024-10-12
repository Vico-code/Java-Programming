package week4;

import java.util.Scanner;

public class task10 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the monthly saving amount: ");
        double monthlySaving = scanner.nextDouble();
        
        double annualInterestRate = 5;
        double monthlyInterestRate = annualInterestRate / 12.0 / 100;
        
        double accountValue = 0;
        for (int i = 1; i <= 6; i++) {
            accountValue += monthlySaving;
            accountValue *= (1 + monthlyInterestRate);
        }
        
        System.out.printf("The account value after the sixth month is %.2f", accountValue);
    }
}
