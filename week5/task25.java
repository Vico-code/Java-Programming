package week5;

import java.util.Scanner;

public class task25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first city: ");
        String city1 = input.nextLine();

        System.out.print("Enter the second city: ");
        String city2 = input.nextLine();

        System.out.print("Enter the third city: ");
        String city3 = input.nextLine();

        String[] cities = {city1, city2, city3};

        sortCities(cities);

        System.out.println("The three cities in alphabetical order are " + cities[0] + " " + cities[1] + " " + cities[2]);

        input.close();
    }

    private static void sortCities(String[] cities) {
        for (int i = 0; i < cities.length; i++) {
            for (int j = i + 1; j < cities.length; j++) {
                if (cities[i].compareTo(cities[j]) > 0) {
                    String temp = cities[i];
                    cities[i] = cities[j];
                    cities[j] = temp;
                }
            }
        }
    }
}
