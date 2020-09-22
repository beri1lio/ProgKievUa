package lecture08.homework1;

import java.io.File;

public class Folder {
    public static void main(String[] args) {
        File file = new File("AAA");
        file.mkdirs();

        isFolder(file);
    }

    public static void isFolder(File folder) {
        if (folder.isDirectory()) {
            File[] files = folder.listFiles();
            for (File file : files) {
                isFolder(file);
            }
            System.out.println(folder.getName());
        }
    }
}
