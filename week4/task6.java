package week4;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter weight in pounds: ");
        double weightPounds = scanner.nextDouble();
        
        System.out.print("Enter height in inches: ");
        double heightInches = scanner.nextDouble();
        
        final double POUNDS_TO_KILOGRAMS = 0.45359237;
        final double INCHES_TO_METERS = 0.0254;
        
        double weightKilograms = weightPounds * POUNDS_TO_KILOGRAMS;
        double heightMeters = heightInches * INCHES_TO_METERS;
        
        double bmi = weightKilograms / Math.pow(heightMeters, 2);
        
        System.out.printf("BMI is %.3f", bmi);
    }
}
