package lecture05.homework1;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*10);
        }
        int[] array2 = Arrays.copyOf(array, 30);

        for (int i = 0; i < array.length; i++) {
            array2[i+15] = array[i]*2;
        }

        System.out.println(Arrays.toString(array2));
    }
}
