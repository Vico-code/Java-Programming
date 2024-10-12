package week4;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the driving distance: ");
        double distanceMiles = scanner.nextDouble();
        
        System.out.print("Enter miles per gallon: ");
        double mpg = scanner.nextDouble();
        
        System.out.print("Enter price per gallon: ");
        double pricePerGallon = scanner.nextDouble();
        
        double gallonsNeeded = distanceMiles / mpg;
        double costOfTrip = gallonsNeeded * pricePerGallon;
        
        System.out.printf("The cost of the trip is $%.2f", costOfTrip);
    }
}