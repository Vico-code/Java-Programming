package week6;

public class task14 {
    public static void main(String[] args) {
        final double a = 10000; 
        final double b = 20000;
        final double RATE = 0.07;
        int years = 0; 
        double tuition = a;
        while (tuition < b) {
            tuition *= (1 + RATE); 
            years++; 
        }

        System.out.println("Tuition will be doubled in " + years + " years");
        System.out.printf("Tuition will be $%.2f in %d years\n", tuition, years);
    }
}