package lecture05;

import java.util.Scanner;

public class CharB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input line: ");
        String line = sc.nextLine();

        char[] array = line.toCharArray();

        int counter = 0;

        for (char c : array) {
            if (c == 'b') {
                counter += 1;
            }
        }

        System.out.println("Counter of letter b in this line is " + counter);
    }
}
