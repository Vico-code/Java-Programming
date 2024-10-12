package week4;

import java.util.Random;
import java.util.Scanner;

public class task19{
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int number1 = rand.nextInt(10);
        int number2 = rand.nextInt(10);
        System.out.println("What is " + number1 + " + " + number2 + "?");
        int answer = input.nextInt();
        if (answer == number1 + number2) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}