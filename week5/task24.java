package week5;

import java.util.Scanner;

public class task24{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        char letter = input.next().charAt(0);

        if (Character.isLetter(letter)) {
            
            if ("aeiouAEIOU".indexOf(letter) != -1) {
                System.out.println(letter + " is a vowel");
            } else {
                System.out.println(letter + " is a consonant");
            }
        } else {
            
            System.out.println(letter + " is an invalid input");
        }

        input.close();
    }
}
