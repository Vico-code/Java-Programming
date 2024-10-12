package week4;

import java.util.Scanner;

public class task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a score: ");
        int score = scanner.nextInt();
        double pay = 1000; 
        if (score > 90) {
            pay += pay * 0.03;
        } else {
            pay += pay * 0.01; 
        }
        System.out.printf("Updated pay: %.2f", pay);
    }
}