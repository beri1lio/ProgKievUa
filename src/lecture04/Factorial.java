package lecture04;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number between 4 and 16: ");
        int number = sc.nextInt();
        int facX = number;

        for(int i = number -1; i > 0; i -= 1){
            facX = facX * i;
        }

        System.out.printf("Factorial %d is %d", number, facX);
        sc.close();
    }
}