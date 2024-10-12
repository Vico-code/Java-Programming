import java.util.Scanner;

public class Example_3_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your pay: ");
        double pay = input.nextDouble();

        System.out.print("Enter your score: ");
        double score = input.nextDouble();

        if (score > 90) {
            double newPay = pay + (pay * 0.03);
            System.out.println("Your new pay is: " + newPay);
        } else {
            double newPay = pay + (pay * 0.01);
            System.out.println("Your new pay is: " + newPay);
        }

        input.close();
    }
}