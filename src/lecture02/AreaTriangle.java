package lecture02;

public class AreaTriangle {
    public static void main(String[] args) {
        double a = 13;
        double b = 14;
        double c = 15;
        double areaTriangle;
        double semiPerimeter = (a + b + c)/2;

        areaTriangle = Math.sqrt(semiPerimeter*(semiPerimeter-a)*(semiPerimeter-b)*(semiPerimeter-c));

        System.out.println("Area of the triangle is " + areaTriangle);

    }
}
