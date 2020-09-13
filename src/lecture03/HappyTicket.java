package lecture03;

import java.util.Scanner;

public class HappyTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number ticket: ");
        int number = sc.nextInt();

        int firstDigit = number/1000;
        int secondDigit = number/100%10;
        int thirdDigit = number/10%10;
        int fourthDigit = number%10;

        int firstHalf = firstDigit+secondDigit;
        if(firstHalf > 9){
            firstHalf = firstHalf/10%10 + firstHalf%10;
        }
        int secondHalf = thirdDigit+fourthDigit;
        if(secondHalf > 9){
            secondHalf = secondHalf/10%10 + secondHalf%10;
        }

        if(firstHalf == secondHalf){
            System.out.println("Happy ticket");
        } else{
            System.out.println("Regular ticket");
        }

        sc.close();
    }
}

