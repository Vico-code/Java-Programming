package week4;


import java.util.Scanner;

public class task9 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double monthlySaving = 100;
        double annualInterestRate = 5;
        double monthlyInterestRate = annualInterestRate / 12.0 / 100;
        System.out.print("Enter the month: ");
        int i = scanner.nextInt();

        double accountValue = monthlySaving;
        for (; i <= 6; i++) {
            accountValue = (accountValue + monthlySaving) * (1 + monthlyInterestRate);
        }
        
        System.out.printf("The account value after the %d month is %.2f",1, accountValue);
    }
}