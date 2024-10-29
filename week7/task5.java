package week7;

public class task5 {
    public static void main(String[] args) {
        nPrintln("Welcome to Java", 5);
        nPrintln(15, "Computer Science");
    }

    public static void nPrintln(String message, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(message);
        }
    }
    public static void nPrintln(int n, String message) {
        for (int i = 0; i < n; i++) {
            System.out.println(message);
        }
    }
}