package lecture08.homework1;

import java.io.*;

public class TextEditor {
    public static void main(String[] args) {
        File file = new File("editor.txt");
        saveTextToFile(getText(), file);
    }

    public static void saveTextToFile(String text, File file) {
        try (PrintWriter pw = new PrintWriter(file)) {
            pw.print(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getText() {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String text;
            System.out.println("Input text:");
            do {
                text = reader.readLine();
                if (text.equals("exit")) {
                    break;
                }
                sb.append(text).append(System.lineSeparator());
            } while (true);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return sb.toString();
    }
}
