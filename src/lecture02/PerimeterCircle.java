package lecture02;

import java.util.Scanner;

public class PerimeterCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input radius: ");
        int radius = sc.nextInt();

        double perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter of the circle is " + perimeter);
        sc.close();
    }
}
