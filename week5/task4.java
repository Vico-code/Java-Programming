package week5;

public class task4 {
    public static void main(String[] args) {
        // Try the following examples and compare the output.

        System.out.println(Math.max(2, 3)); // returns 3

        System.out.println(Math.min(2.5, 4.6)); // returns 2.5

        System.out.println(Math.max(Math.max(2.5, 4.6), Math.min(3, 5.6))); // returns 4.6

        System.out.println(Math.abs(-2)); // returns 2

        System.out.println(Math.abs(-2.1)); // returns 2.1

// Return a random integer between 0 and 9.
        System.out.println((int)(Math.random() * 10));

// Return a random integer between 50 and 99.
        System.out.println(50 + (int)(Math.random() * 50));

// In general,
// Return a random integer between a and a+b-1.
        int a = 10; // Example lower bound
        int b = 20; // Example range
        System.out.println(a + (int)(Math.random() * b));
    }
}
