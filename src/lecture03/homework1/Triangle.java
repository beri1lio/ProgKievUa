package lecture03.homework1;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the first side: ");
        int a = sc.nextInt();
        System.out.print("Input the second side: ");
        int b = sc.nextInt();
        System.out.print("Input the third side: ");
        int c = sc.nextInt();

        if(a+b > c && a+c > b && b+c > a){
            System.out.println("Triangle exists.");
        } else {
            System.out.println("Triangle does not exist.");
        }
        sc.close();
    }
}
