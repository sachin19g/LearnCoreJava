package com.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FIleClass {

    private String path = "Test.txt";
    File file = new File (path);
    FileWriter filewriter = new FileWriter (path);


    public FIleClass() throws Exception {
    }

    public void createFile() throws IOException {

        if (file.createNewFile ()) {
            System.out.println ("New File Created :-" + file.getAbsolutePath ());
        } else
            System.out.println ("File Exsit :-" + file.getAbsolutePath ());

    }

    public void writeIntoFile() throws IOException {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Please enter data to Write In to File");
        if (scanner.hasNext ()) {

            String ss = scanner.nextLine ();
            filewriter.write (ss);

        } else {

            System.out.println ("No input data");
        }

        filewriter.close ();

    }

    public void readFile() throws FileNotFoundException {
        Scanner scanner = new Scanner (file);
        System.out.println (" You have Entred belwo file data");
        if (scanner.hasNext ()) {
            String s = scanner.nextLine ();
            System.out.println (s);

        } else
            System.out.println ("There is no data to read the file");

        scanner.close ();
    }
}