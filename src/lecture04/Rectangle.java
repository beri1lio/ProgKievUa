package lecture04;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input height: ");
        int height = sc.nextInt();
        System.out.print("Input width: ");
        int width = sc.nextInt();

        for(int i = 0; i < height; i+=1){
            for(int j = 0; j < width; j+=1){
                if(i==0 || i==height-1){
                    System.out.print("*");
                } else if(j>0 && j<width-1){
                    System.out.print(" ");
                } else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        sc.close();
    }

}
