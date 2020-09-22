package lecture07.homework1;

import java.util.Scanner;

public class ReadBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the binary code: ");
        String code = sc.nextLine();

        StringBuilder sb = new StringBuilder(code);
        sb.reverse();

        int output = 0;

        for (int i = 0; i < sb.length(); i++) {
            output += Character.getNumericValue(sb.charAt(i)) * Math.pow(2, i);
        }

        System.out.printf("\"%s\" -> %d", code, output);
        sc.close();
    }
}
