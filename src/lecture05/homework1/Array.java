package lecture05.homework1;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input array size: ");
        int arraySize = sc.nextInt();
        int[] array = new int[arraySize];
        for(int i = 0; i < array.length; i +=1){
            System.out.print("Input number: ");
            array[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(array));
        sc.close();
    }
}
