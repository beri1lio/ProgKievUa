package lecture06.homework1;

public class Rectangle {
    public static void main(String[] args) {
        drawRectangle(3, 2);
    }

    static void drawRectangle(int height, int width) {
        for (int i = 0; i < height; i += 1) {
            for (int j = 0; j < width; j += 1) {
                if (i == 0 || i == height - 1) {
                    System.out.print("*");
                } else if (j > 0 && j < width - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
