package SduPractice.PA;

public abstract class GenericMatrix<E extends Number> {

    public static void main(String[] args) {
        Integer[][] m1 = {{1, 2, 3}, {4, 5, 6}, {1, 1, 1}};
        Integer[][] m2 = {{1, 1, 1}, {2, 2, 2}, {0, 0, 0}};

        IntegerMatrix integerMatrix = new IntegerMatrix();

        System.out.println("\nm1 + m2 is ");
        GenericMatrix.printResult(m1, m2, integerMatrix.addMatrix(m1, m2), '+');

        System.out.println("\nm1 * m2 is ");
        GenericMatrix.printResult(m1, m2, integerMatrix.multiplyMatrix(m1, m2), '*');

    }

    /**
     * Abstract method for adding two elements of the matrices
     */
    protected abstract E add(E o1, E o2);

    /**
     * Abstract method for multiplying two elements of the matrices
     */
    protected abstract E multiply(E o1, E o2);

    /**
     * Abstract method for defining zero for the matrix element
     */
    protected abstract E zero();

    /**
     * Add two matrices
     */
    public E[][] addMatrix(E[][] matrix1, E[][] matrix2) {
        // Check bounds of the two matrices
        if ((matrix1.length != matrix2.length) || (matrix1[0].length != matrix2[0].length)) {
            throw new RuntimeException("The matrices do not have the same size");
        }
        E[][] result = (E[][]) new Number[matrix1.length][matrix1[0].length];
        // Perform addition
        for (int i = 0; i < result.length; i++)
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = add(matrix1[i][j], matrix2[i][j]);
            }
        return result;
    }

    /**
     * Multiply two matrices
     */
    public E[][] multiplyMatrix(E[][] matrix1, E[][] matrix2) {
        // Check bounds
        if (matrix1[0].length != matrix2.length) {
            throw new RuntimeException("The matrices do not have compatible size");
        }
        // Create result matrix
        E[][] result = (E[][]) new Number[matrix1.length][matrix2[0].length];
        // Perform multiplication of two matrices
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                result[i][j] = zero();
                for (int k = 0; k < matrix1[0].length; k++) {
                    result[i][j] = add(result[i][j], multiply(matrix1[i][k], matrix2[k][j]));
                }
            }
        }
        return result;
    }

    /**
     * Print matrices, the operator, and their operation result
     */
    public static void printResult(Number[][] m1, Number[][] m2, Number[][] m3, char op) {
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++)
                System.out.print(" " + m1[i][j]);
            if (i == m1.length / 2)
                System.out.print(" " + op + " ");
            else
                System.out.print(" ");
            for (int j = 0; j < m2.length; j++)
                System.out.print(" " + m2[i][j]);
            if (i == m1.length / 2)
                System.out.print(" = ");
            else
                System.out.print(" ");
            for (int j = 0; j < m3.length; j++)
                System.out.print(m3[i][j] + " ");
            System.out.println();
        }
    }
}
