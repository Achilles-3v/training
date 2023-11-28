package com.vitalii.filehandlingdemo;
import java.io.*;

public class FileHandlingDemo {
    public static void main(String[] args) {
        writeFile();

        File f = new File("src//com//vitalii//filehandlingdemo//myFile.txt");
        File nf = new File("src//com//vitalii//filehandlingdemo//myNewFile.txt");
        boolean fileRename = f.renameTo(nf);
        System.out.println(fileRename);

        boolean fileDelete = f.delete();
        System.out.println(fileDelete);

        readFile();
    }

    public static void writeFile() {
        String text = "Good Bay!";
        try(BufferedWriter writer = new BufferedWriter
                (new FileWriter("src//com//vitalii//filehandlingdemo//myFile.txt", true))) {
            writer.write(text);
            writer.newLine();
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void readFile() {
        String line;
        try (BufferedReader reader = new BufferedReader
                (new FileReader("src//com//vitalii//filehandlingdemo//myNewFile.txt"))){
            line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
