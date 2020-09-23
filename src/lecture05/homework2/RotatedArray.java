package lecture05.homework2;

import java.util.Arrays;

public class RotatedArray {
    public static void main(String[] args) {
        int[][] array = new int[6][6];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = j + 1;
            }
        }
        System.out.println("Array:");
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();


        for (int k = 90; k <= 270; k += 90) {
            for (int i = 0; i < array.length / 2; i++) {
                int iMax = array.length - i - 1;
                for (int j = i; j < iMax; j++) {
                    int jMax = array.length - j - 1;

                    int n = array[j][i];
                    array[j][i] = array[iMax][j];
                    array[iMax][j] = array[jMax][iMax];
                    array[jMax][iMax] = array[i][jMax];
                    array[i][jMax] = n;
                }
            }

            System.out.println(String.format("Array rotation on %d°:", k));
            for (int[] row : array) {
                System.out.println(Arrays.toString(row));
            }
            System.out.println();
        }
    }
}
