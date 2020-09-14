package code.challenge.demo.taxcalculator.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CustomFileReader {



    public static String readFromFile(String fileName) {
        StringBuilder sb = new StringBuilder();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(fileName));
            String line = null;
            while ((line = reader.readLine()) != null) {
                sb.append("\n").append(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("readFromFile file not found");
        } catch (IOException e) {
            System.out.println("readFromFile io exception," + e.getMessage());
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("reader close exception," + e.getMessage());
                }
            }
        }
        return sb.toString();
    }
}
