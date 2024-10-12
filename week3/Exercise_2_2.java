import java.util.Scanner;

public class Exercise_2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the subtotal and a gratuity rate: ");

        double subtotal = input.nextDouble();
        double gratuity_rate = input.nextDouble();
        gratuity_rate = gratuity_rate * 0.01;

        double gratuity = subtotal * gratuity_rate;
        double sum = subtotal + gratuity;
        System.out.println("The gratuity is $" + gratuity +
                " and total is $" + sum);
    }
}