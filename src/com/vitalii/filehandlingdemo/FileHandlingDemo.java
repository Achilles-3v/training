package com.vitalii.filehandlingdemo;
import java.io.*;

public class FileHandlingDemo {
    public static void main(String[] args) {
        String line;

        try (BufferedReader reader = new BufferedReader
                (new FileReader("src//com//vitalii//filehandlingdemo//myFile.txt"))){
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
