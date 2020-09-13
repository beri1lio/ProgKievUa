package lecture04.homework1;

import java.util.Scanner;

public class WallPaper{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number: ");
        int number = sc.nextInt();
        int counter = 0;
        for(int i = 0; i < 5; i+=1){
            for(int j = 0; j < number*3; j +=1){
                if(counter < 3){
                    System.out.print("*");
                } else {
                    System.out.print("+");
                }
                if(counter < 5){
                    counter += 1;
                } else{
                    counter = 0;
                }
            }
            counter = 0;
            System.out.println();
        }
        sc.close();
    }
}