package lecture03.homework2;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number: ");
        int number = sc.nextInt();

        int firstDigit = number/100_000;
        int secondDigit = number/10_000%10;
        int thirdDigit = number/1000%10;
        int fourthDigit = number/100%10;
        int fifthDigit = number/10%10;
        int sixthDigit = number%10;

        if((firstDigit == sixthDigit) &&
                (secondDigit == fifthDigit) &&
                (thirdDigit == fourthDigit)){
            System.out.println("Number is palindrome");
        } else{
            System.out.println("Number is not palindrome");
        }

        sc.close();
    }
}
