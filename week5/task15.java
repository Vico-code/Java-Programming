package week5;

import java.util.Scanner;

public class task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two cities
        System.out.print("Enter the first city: ");
        String city1 = scanner.nextLine();

        System.out.print("Enter the second city: ");
        String city2 = scanner.nextLine();

        // Check if city1 comes before city2 in alphabetical order
        if (city1.compareTo(city2) < 0) {
            // The cities in alphabetical order are city1 + city2
            System.out.println("The cities in alphabetical order are: " + city1 + " " + city2);
        } else {
            // The cities in alphabetical order are city2 + city1
            System.out.println("The cities in alphabetical order are: " + city2 + " " + city1);
        }

        scanner.close();
    }
}
