package week5;

public class task19 {
    public static void main(String[] args) {
        // 定义变量
        int count = 5;
        double amount = 45.56;

        // 使用printf方法格式化输出数量和金额
        // 注意：格式字符串中的%d和%f应该与变量的顺序和类型相匹配
        System.out.printf("Count is %d and amount is %.2f%n", count, amount);

        // 显示带有千位分隔符的数字
        System.out.printf("%,8d %,10.1f%n", 12345678, 12345678.263);
    }
}
