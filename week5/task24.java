package week5;

import java.util.Scanner;

public class task24{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 提示用户输入一个字母
        System.out.print("Enter a letter: ");
        char letter = input.next().charAt(0);

        // 检查输入是否为字母
        if (Character.isLetter(letter)) {
            // 检查字母是否为元音
            if ("aeiouAEIOU".indexOf(letter) != -1) {
                System.out.println(letter + " is a vowel");
            } else {
                System.out.println(letter + " is a consonant");
            }
        } else {
            // 显示无效输入消息
            System.out.println(letter + " is an invalid input");
        }

        input.close();
    }
}
