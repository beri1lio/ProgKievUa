package lecture08.homework1;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Array {
    public static void main(String[] args) {
        int[][] array = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {1, 25, 345}};
        String text = fromArrayToString(array);
        System.out.println(text);
        File file = new File("array.txt");
        saveTextToFile(text, file);
    }

    public static void saveTextToFile(String text, File file) {
        try (PrintWriter pw = new PrintWriter(file)) {
            pw.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String fromArrayToString(int[][] array) {
        StringBuilder sb = new StringBuilder();
        for (int[] rows : array) {
            for (int col : rows) {
                sb.append(String.format("%-6.6s\t", "" + col));
            }
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }
}
