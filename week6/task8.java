package week6;

public class task8 {
    public static void main(String[] args) {
        System.out.println("  Multiplication Table");

        System.out.println("     ");
        System.out.print("  ");
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%5d", i);
        }
        System.out.println("\n---------------------------------------------------------");

        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d ", i);
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%5d", i * j);
            }
            System.out.println();
        }
    }
}