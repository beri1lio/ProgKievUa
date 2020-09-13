package lecture03.homework1;

import java.util.Scanner;

public class Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input year: ");
        int year = sc.nextInt();

        if (year % 400 == 0) {
            System.out.println("Leap year - 366 days");
        } else if (year % 100 == 0) {
            System.out.println("Common year - 365 days");
        } else if(year % 4 == 0){
            System.out.println("Leap year - 366 days");
        } else {
            System.out.println("Common year - 365 days");
        }
        sc.close();
    }
}
