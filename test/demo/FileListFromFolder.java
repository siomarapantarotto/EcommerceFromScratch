package demo;

import java.io.File;

public class FileListFromFolder {

    public static void main(String a[]) {

        System.out.println("\n********************** File list from a folder **********************\n");

        // Folder path to display files
        File file = new File("C:/");

        String[] fileList = file.list();

        for (String name : fileList) {
            System.out.println(name);
        }
    }
}
