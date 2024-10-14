package week6;

import java.util.Scanner;

public class task15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string to check if it is a palindrome: ");
        String s = input.nextLine();
        int t = 1;
        s = s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                t = 0;
            }
            left++;
            right--;
        }
        

        if (t==1) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}