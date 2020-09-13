package lecture05;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayVersa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input size array: ");
        int sizeArray = sc.nextInt();
        int[] array = new int[sizeArray];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*10);
        }
        System.out.println("Array - " + Arrays.toString(array));

        for (int i = 0; i < array.length/2; i += 1) {
            int x = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1] = x;
        }
        System.out.println("Array versa - " + Arrays.toString(array));
        sc.close();
    }
}
