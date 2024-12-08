package week11;
public class task11 {
    public static void main(String[] args) {
        // Two-dimensional array to store work hours for each employee
        int[][] workHours = {
                {2, 4, 3, 4, 5, 8, 8},
                {7, 3, 4, 3, 3, 4, 4},
                {3, 3, 4, 3, 3, 2, 2},
                {9, 3, 4, 7, 3, 4, 1},
                {3, 5, 4, 3, 6, 3, 8},
                {3, 4, 4, 6, 3, 4, 4},
                {3, 7, 4, 8, 3, 8, 4},
                {6, 3, 5, 9, 2, 7, 9}
        };

        // Array to store the total hours and corresponding employee index
        int[] totalHours = new int[workHours.length];
        for (int i = 0; i < workHours.length; i++) {
            totalHours[i] = 0;
            for (int j = 0; j < workHours[i].length; j++) {
                totalHours[i] += workHours[i][j];
            }
        }

        // Sort the total hours in descending order using a simple sorting algorithm
        for (int i = 0; i < totalHours.length - 1; i++) {
            for (int j = 0; j < totalHours.length - i - 1; j++) {
                if (totalHours[j] < totalHours[j + 1]) {
                    // Swap total hours
                    int temp = totalHours[j];
                    totalHours[j] = totalHours[j + 1];
                    totalHours[j + 1] = temp;
                }
            }
        }

        // Print the employees and their total hours in descending order
        System.out.println("Employee | Total Hours");
        for (int i = 0; i < totalHours.length; i++) {
            System.out.println((i + Employee) + " | " + totalHours[i]);
        }
    }
}