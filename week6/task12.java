package week6;

public class task12 {
    public static void main(String[] args) {
        final int TOTAL_PRIMES = 50;
        final int PRIMES_PER_LINE = 10;
        int count = 0;
        int number = 2;

        while (count < TOTAL_PRIMES) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;
                if (count % PRIMES_PER_LINE == 0) {
                    System.out.println();
                }
            }
            number++;
        }
    }
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}