import java.io.*;

public class FileList {

    public void traverse(String path) {
        File root = new File(path);
        File[] files = root.listFiles();
        if (files == null) return;
        for (File f : files) {
            if (f.isDirectory()) {
                traverse(f.getAbsolutePath());
                System.out.println("Directory: " + f.getAbsoluteFile());
            } else {
                System.out.println("File: " + f.getAbsoluteFile());
            }
        }
    }

    public static void main(String[] args) {
        FileList fileList = new FileList();
        fileList.traverse(args[0]);
    }
}