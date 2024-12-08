package week11;
import java.util.Arrays;
import java.util.Random;

public class task14 {
    // Method to shuffle the rows in a two-dimensional int array
    public static void shuffle(int[][] m) {
        int rows = m.length;
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            // Generate a random index to swap with
            int j = random.nextInt(rows);
            // Swap rows i and j
            for (int k = 0; k < m[i].length; k++) {
                int temp = m[i][k];
                m[i][k] = m[j][k];
                m[j][k] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};

        // Shuffle the matrix
        shuffle(m);

        // Print the shuffled matrix
        System.out.println("Shuffled matrix:");
        for (int[] row : m) {
            System.out.println(Arrays.toString(row));
        }
    }
}