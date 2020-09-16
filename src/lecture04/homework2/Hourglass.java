package lecture04.homework2;

import java.util.Scanner;

public class Hourglass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input odd number: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i ++){
            for(int j = 0; j < n; j ++){
                if(i==0 || i == n-1){
                    System.out.print("*");
                }
                else if(i < (n-1)/2){
                    if(j < i || j >= n - i){
                        System.out.print(" ");
                    } else{
                        System.out.print("*");
                    }
                } else if(i == (n-1)/2){
                    if(j != (n-1)/2){
                        System.out.print(" ");
                    } else{
                        System.out.print("*");
                    }

                } else{
                    if(j < Math.abs(i - (n-1)) || j > i){
                        System.out.print(" ");
                    } else{
                        System.out.print("*");
                    }
                }

            }
            System.out.println();
        }
        sc.close();
    }
}
