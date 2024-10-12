import java.util.Scanner;

public class Exercise_2_6{
    public static void main(String[] args) {
        double money;
        double rate = 0.05/12;

        System.out.print("Enter the Monthly saving amount: ");
        Scanner input = new Scanner(System.in);
        money = input.nextDouble();

        double new_money = 0;
        for(int i=0; i<6; i++){
            new_money = (money+new_money) * (1 + rate);
        }

        System.out.printf("After the sixth month, the account value is $%.2f\n", new_money);
    }
}
