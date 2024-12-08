package week11;
public class task6 {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];

        // Insert random values in 2D array
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[0].length; column++) {
                matrix[row][column] = (int)(Math.random() * 20);
            }
        }

        int maxOfRow = 0;
        int indexOfMaxRow = 0;
        // Get sum of the elements in the first row
        for (int column = 0; column < matrix[0].length; column++) {
            maxOfRow += matrix[0][column];
        }

        // Get the sum of the elements in the other rows
        // and compare it with the maxOfRow
        int totalOfThisRow = 0;
        for (int row = 1; row < matrix.length; row++) {
            for (int column = 0; column < matrix[0].length; column++) {
                totalOfThisRow += matrix[row][column];
            }
            if (totalOfThisRow > maxOfRow) {
                maxOfRow = totalOfThisRow;
                indexOfMaxRow = row;
            }
        }
        System.out.println("Row " + indexOfMaxRow + " has the maximum sum of " + maxOfRow);
    }
}