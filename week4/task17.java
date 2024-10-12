package week4;

import java.util.Scanner;

public class task17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (two digits): ");
        int userNumber = input.nextInt();
        int lotteryNumber = (int) (Math.random() * 90 + 10);
        System.out.println("The lottery number is " + lotteryNumber);
        if (userNumber == lotteryNumber) {
            System.out.println("You win $10,000!");
        } else if (Integer.toString(userNumber).equals(Integer.toString(lotteryNumber))) {
            System.out.println("Match both digits: you win $3,000");
        } else if (userNumber / 10 == lotteryNumber / 10 || userNumber % 10 == lotteryNumber % 10) {
            System.out.println("Match one digit: you win $1,000");
        } else {
            System.out.println("Sorry: no watch");
        }
    }
}