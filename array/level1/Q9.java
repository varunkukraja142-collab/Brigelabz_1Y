public class Q9 {
    public static void main(String[] args) {

        int[][] twoD = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int rows = twoD.length;
        int cols = twoD[0].length;

        int[] oneD = new int[rows * cols];

        int index = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                oneD[index] = twoD[i][j];
                index++;
            }
        }

        System.out.println("2D Array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n1D Array after copying:");
        for (int i = 0; i < oneD.length; i++) {
            System.out.print(oneD[i] + " ");
        }
    }
}
