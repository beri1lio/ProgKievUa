package lecture03.homework1;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first number: ");
        int a = sc.nextInt();
        System.out.print("Input second number: ");
        int b = sc.nextInt();
        System.out.print("Input third number: ");
        int c = sc.nextInt();
        System.out.print("Input fourth number:  ");
        int d = sc.nextInt();

        int max;

        if(a < b){
            a = b;
        }
        if(a < c){
            a = c;
        }
        if(a < d){
            a = d;
        }
        max = a;

        System.out.println("Maximum number is " + max);

        sc.close();
    }
}
