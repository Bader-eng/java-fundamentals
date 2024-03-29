/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {


    public static void main(String[] args) {
        Path path = Paths.get("./app/src/main/resources/gates.js");

        System.out.print(linter(path));
    }

    public static String linter(Path path) {


        String result="";


        BufferedReader reader = null;


        try {
            reader = Files.newBufferedReader(path);
            String line = reader.readLine();
            int number=1;

            while (line != null) {
                if(line.endsWith(";") || line.isEmpty() || line.endsWith("{") || line.endsWith("}") || line.contains("if") || line.contains("else") ){
                }
                else {
                    result = result +"Line "+number+ " Missing semicolon."+"\n";

                }
                    number++;
                    line = reader.readLine();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("an error occurred while closing the file");
                }
            }

            return result;
        }




    }


    }