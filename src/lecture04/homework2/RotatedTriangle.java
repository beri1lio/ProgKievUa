package lecture04.homework2;

import java.util.Scanner;

public class RotatedTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input height: ");
        int height = sc.nextInt();
        char ch = '*';
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= height*2 -1; i += 1) {
            if(i > height){
                sb.deleteCharAt(0);
            } else {
                sb.append(ch);
            }
            System.out.println(sb);
        }
        sc.close();
    }
}
