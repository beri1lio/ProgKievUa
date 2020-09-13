package lecture03.homework2;

import java.util.Scanner;

public class PointInCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input coordinate x: ");
        double x = sc.nextDouble();
        System.out.print("Input coordinate y: ");
        double y = sc.nextDouble();

        double radius = 4.0;
        double currentRadius = Math.sqrt(x*x + y*y);

        if (currentRadius > radius) {
            System.out.println("Point outside the circle.");
        } else {
            System.out.println("Point in a circle.");
        }
        sc.close();
    }
}
