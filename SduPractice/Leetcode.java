package SduPractice;

import java.util.Arrays;

public class Leetcode {

    public static void main(String[] args) {
        SubrectangleQueries subrectangleQueries;
        int[][] rectangle = {{1,2,1},{4,3,4},{3,2,1},{1,1,1}};
        subrectangleQueries = new SubrectangleQueries(rectangle);
        subrectangleQueries.printArray2D(rectangle);
        System.out.println(subrectangleQueries.getValue(0, 2));
        subrectangleQueries.updateSubrectangle(0, 0, 3, 2, 5);
        subrectangleQueries.printArray2D(rectangle);
        System.out.println(subrectangleQueries.getValue(0, 2));
        System.out.println(subrectangleQueries.getValue(3, 1));
        subrectangleQueries.updateSubrectangle(3, 0, 3, 2, 10);
        subrectangleQueries.printArray2D(rectangle);
        System.out.println(subrectangleQueries.getValue(3, 1)); // return 10
        System.out.println(subrectangleQueries.getValue(0, 2)); // return 5
    }
}

class SubrectangleQueries {

    static int[][] matrix;

    public SubrectangleQueries(int[][] rectangle) {
        matrix = new int[rectangle.length][];
        for (int i = 0; i < rectangle.length; i++) {
            matrix[i] = new int[rectangle[i].length];
            for (int j = 0; j < rectangle[i].length; j++) {
                matrix[i][j] = rectangle[i][j];
            }
        }
    }

    public String updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        for(int i = row1; i <= row2; i++){
            for(int j = col1; j <= col2; j++){
                matrix[i][j] = newValue;
            }
        }
        return Arrays.toString(matrix);
    }

    public int getValue(int row, int col) {
        return matrix[row][col];
    }

    public static void printArray2D(int[][] array2D) {
        for (int[] row : array2D) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
