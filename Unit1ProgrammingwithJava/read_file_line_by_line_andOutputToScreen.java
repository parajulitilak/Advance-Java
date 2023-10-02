/*
 * 17.Write a program to read the contents of a file one line at a time and output them to the
 * screen.*/
package Unit1ProgrammingwithJava;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class read_file_line_by_line_andOutputToScreen {
    public static void main(String[] args) {
        String filename = "example.txt";

        // Create the file with sample text
        createFile(filename);

        // Read and display the contents of the file
        readAndDisplayFileContents(filename);
    }

    private static void createFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write("This is the first line of the file.");
            writer.newLine();
            writer.write("This is the second line of the file.");
            writer.newLine();
            writer.write("This is the third line of the file.");
            System.out.println("File created: " + filename);
        } catch (IOException e) {
            System.err.println("Error creating the file: " + e.getMessage());
        }
    }

    private static void readAndDisplayFileContents(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;

            System.out.println("File Contents:");

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}

