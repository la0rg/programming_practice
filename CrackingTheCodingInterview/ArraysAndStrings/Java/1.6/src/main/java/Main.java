
public class Main {

    /**
     * rotate clockwise
     *
     * @param matrix
     * @return matrix
     */
    public static int[][] rotate(int[][] matrix) {
        rotateInPlace(matrix);
        return matrix;
    }

    /**
     * Perform index by index swap on each layer, starting from the outermost layer
     * and working our way inwards.
     *
     * @param matrix
     */
    private static void rotateInPlace(int[][] matrix) {
        if (matrix.length == 0) {
            return;
        }
        if (matrix.length != matrix[0].length) {
            throw new IllegalArgumentException("Matrix should be squared");
        }

        int currentLeft = 0, currentRight = matrix.length - 1;

        while (currentRight > currentLeft) {
            for (int i = 0; i < currentRight - currentLeft; i++) {
                // save top
                int temp = matrix[currentLeft][currentLeft + i];

                // left -> top
                matrix[currentLeft][currentLeft + i] = matrix[currentRight - i][currentLeft];

                // bottom -> left
                matrix[currentRight - i][currentLeft] = matrix[currentRight][currentRight - i];

                // right -> bottom
                matrix[currentRight][currentRight - i] = matrix[currentLeft + i][currentRight];

                // top -> right
                matrix[currentLeft + i][currentRight] = temp;
            }
            currentLeft++;
            currentRight--;
        }
    }
}
