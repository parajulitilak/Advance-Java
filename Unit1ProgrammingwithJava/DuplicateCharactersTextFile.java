/*
 * 15. Write a program to duplicate each character in a text file and write the output in a
 * separate file using character stream.
 * */
package Unit1ProgrammingwithJava;

import java.io.*;

public class DuplicateCharactersTextFile {
    public static void main(String[] args) {
        String sourceFileName = "input.txt"; // Input file
        String destinationFileName = "output.txt"; // Output file

        try {
            // Create the input file with some text
            createInputFile(sourceFileName);

            // Character streams for reading and writing
            Reader reader = new FileReader(sourceFileName);
            Writer writer = new FileWriter(destinationFileName);

            int charRead;
            while ((charRead = reader.read()) != -1) {
                // Duplicate the character and write it twice
                writer.write(charRead);
                writer.write(charRead);
            }

            System.out.println("Characters duplicated and written to the output file.");

            // Close the streams
            reader.close();
            writer.close();

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    private static void createInputFile(String filename) {
        try (Writer writer = new FileWriter(filename)) {
            writer.write("Hello, World!"); // Write some sample text
            System.out.println("Input file created: " + filename);
        } catch (IOException e) {
            System.err.println("Error creating the input file: " + e.getMessage());
        }
    }
}
