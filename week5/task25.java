package week5;

import java.util.Scanner;

public class task25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 提示用户输入三个城市
        System.out.print("Enter the first city: ");
        String city1 = input.nextLine();

        System.out.print("Enter the second city: ");
        String city2 = input.nextLine();

        System.out.print("Enter the third city: ");
        String city3 = input.nextLine();

        // 创建一个字符串数组并初始化为三个城市
        String[] cities = {city1, city2, city3};

        // 对数组进行排序
        sortCities(cities);

        // 显示排序后的城市
        System.out.println("The three cities in alphabetical order are " + cities[0] + " " + cities[1] + " " + cities[2]);

        input.close();
    }

    // 方法：对城市数组进行排序
    private static void sortCities(String[] cities) {
        for (int i = 0; i < cities.length; i++) {
            for (int j = i + 1; j < cities.length; j++) {
                if (cities[i].compareTo(cities[j]) > 0) {
                    // 交换元素
                    String temp = cities[i];
                    cities[i] = cities[j];
                    cities[j] = temp;
                }
            }
        }
    }
}
