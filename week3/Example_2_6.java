import java.util.Scanner;

public class Example_2_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer for seconds: ");
        int seconds = input.nextInt();
        int minutes = seconds / 60; // Find minutes in seconds
        int remainingSeconds = seconds % 60; // Seconds remaining
        System.out.print(seconds + " seconds is " + minutes + " minutes and " +
                " minutes and" + remainingSeconds + " seconds");
    }
}