package lecture03.homework2;

import java.util.Scanner;

public class PointInTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input x coordinate of the vertex D: ");
        double dx = sc.nextDouble();
        System.out.print("Input y coordinate of the vertex D: ");
        double dy = sc.nextDouble();

        double ax = 0;
        double ay = 0;
        double bx = 4;
        double by = 4;
        double cx = 6;
        double cy = 1;

        double ab = Math.sqrt(Math.pow(Math.abs(ax-bx), 2) + Math.pow(Math.abs(ay-by), 2));
        double ac = Math.sqrt(Math.pow(Math.abs(ax-cx), 2) + Math.pow(Math.abs(ay-cy), 2));
        double bc = Math.sqrt(Math.pow(Math.abs(bx-cx), 2) + Math.pow(Math.abs(by-cy), 2));

        double ad = Math.sqrt(Math.pow(Math.abs(ax-dx), 2) + Math.pow(Math.abs(ay-dy), 2));
        double bd = Math.sqrt(Math.pow(Math.abs(bx-dx), 2) + Math.pow(Math.abs(by-dy), 2));
        double cd = Math.sqrt(Math.pow(Math.abs(cx-dx), 2) + Math.pow(Math.abs(cy-dy), 2));

        double semiPerimeterABC = (ab + ac + bc)/2;
        double semiPerimeterABD = (ab + ad + bd)/2;
        double semiPerimeterACD = (ac + ad + cd)/2;
        double semiPerimeterBCD = (bc + bd + cd)/2;

        double squareABC = Math.sqrt(semiPerimeterABC*(semiPerimeterABC-ab)*(semiPerimeterABC-ac)*(semiPerimeterABC-bc));
        double squareABD = Math.sqrt(semiPerimeterABD*(semiPerimeterABD-ab)*(semiPerimeterABD-ad)*(semiPerimeterABD-bd));
        double squareACD = Math.sqrt(semiPerimeterACD*(semiPerimeterACD-ac)*(semiPerimeterACD-ad)*(semiPerimeterACD-cd));
        double squareBCD = Math.sqrt(semiPerimeterBCD*(semiPerimeterBCD-bc)*(semiPerimeterBCD-bd)*(semiPerimeterBCD-cd));

        double sumSquares = squareABD + squareACD + squareBCD;

        if(Math.abs(sumSquares - squareABC) > 0.01){
            System.out.println("Point outside the triangle.");
        } else {
            System.out.println("Point in a triangle.");
        }
        sc.close();
    }
}
