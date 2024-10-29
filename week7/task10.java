package week7;

import java.util.Random;

public class task10 {
    public static char getRandomCharacter(char ch1, char ch2) {
        Random rand = new Random();
        return (char) (ch1 + rand.nextInt(ch2 - ch1 + 1));
    }
    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }
    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }
    public static void main(String[] args) {
        System.out.println("Random lowercase letter: " + getRandomLowerCaseLetter());
        System.out.println("Random uppercase letter: " + getRandomUpperCaseLetter());
    }
}