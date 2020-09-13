package lecture02;

import java.util.Scanner;

public class CutNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number: ");
        int number = sc.nextInt();

        int firstDigit = number/10_000;
        int secondDigit = (number/1_000)%10;
        int thirdDigit = (number/100)%10;
        int fourthDigit = (number/10)%10;
        int fifthDigit = number%10;

        System.out.println("First digit - " + firstDigit);
        System.out.println("Second digit - " + secondDigit);
        System.out.println("Third digit - " + thirdDigit);
        System.out.println("Fourth digit - " + fourthDigit);
        System.out.println("Fifth digit - " + fifthDigit);
        sc.close();
    }
}

