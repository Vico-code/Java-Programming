package week6;

public class task7 {public static void main(String[] args) {
    int sum = 0; 
    for(int i = 0; i < 10; i++) {
        sum += i;
    }
    System.out.println("Sum of 0 to 9 is: " + sum);

    int j = 0;
    while(j < 10) {
        j++;
    }
    System.out.println("Value of j after while loop: " + j);

    do {
        j++;
    } while(j < 10);
    System.out.println("Value of j after do-while loop: " + j);
}
    }
