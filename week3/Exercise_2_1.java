import java.util.Scanner;

public class Exercise_2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter purchase amount:");
        double purchaseAmount = input.nextDouble();

        double tax = purchaseAmount * 0.06;
        System.out.println("Sale tax is $" + (int) (tax * 100) / 100.0);
    }
}