package week5;

public class task18 {
    public static void main(String[] args) {
        double amount = 12618.98;
        double interestRate = 0.0013;

        double interest = amount * interestRate;

        // 输出利息，没有格式化
        System.out.println("Interest is $" + interest);

        // 使用printf方法格式化输出利息，保留两位小数
        System.out.printf("Interest with two decimal points is $%4.2f%n", interest);

        // 假设这是另一个例子
        int count = 5;
        double amount2 = 45.56;

        // 使用printf方法格式化输出数量和金额
        System.out.printf("Count is %d and amount is $%4.2f%n", count, amount2);
    }
}
