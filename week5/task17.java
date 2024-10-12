package week5;

public class task17 {
    public static void main(String[] args) {
        // String to integer
        String a = "123";
        System.out.println(a + "l"); // 注意：这里假设"+l"是想要打印字符串a后跟字符'l'
        int b = Integer.parseInt(a);
        System.out.println(b + "l"); // 同上，假设意图是打印整数b后跟字符'l'

        // String to double
        String x = "123.45";
        System.out.println(x + 1); // 这里假设意图是打印字符串x后跟数字1
        Double y = Double.parseDouble(x);
        System.out.println(y + 1); // 同上，打印double y后跟数字1

        // Number to String
        String s = 123 + ""; // 这里将整数123转换为字符串
        System.out.println(s + 1); // 打印字符串s后跟数字1
    }
}
