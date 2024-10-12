package week5;

import java.util.Scanner;

public class task22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 提示用户输入一个十进制值
        System.out.print("Enter a decimal value (0 to 15): ");
        int decimal = input.nextInt();

        // 检查输入是否有效
        if (decimal >= 0 && decimal <= 15) {
            // 将十进制转换为十六进制并输出
            System.out.println("The hex value is " + Integer.toHexString(decimal).toUpperCase());
        } else {
            // 显示无效输入消息
            System.out.println(decimal + " is an invalid input");
        }

        input.close();
    }
}
