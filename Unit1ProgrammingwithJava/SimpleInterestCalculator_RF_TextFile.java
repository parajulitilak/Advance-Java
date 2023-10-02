/*16. Write a program to read records from a text file which contains people’s name,
principle, rate and time values. Calculate simple interest and write all the contents of the
source file along with simple interest to destination file
*/
package Unit1ProgrammingwithJava;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SimpleInterestCalculator_RF_TextFile {
    public static void main(String[] args) {
        String sourceFileName = "input.txt"; // Input file containing records
        String destinationFileName = "simpleinterest_output.txt"; // Output file to write records with simple interest

        // Create the input file with sample records
        createInputFile(sourceFileName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFileName))) {

            // Read records from the source file
            try (BufferedReader reader = new BufferedReader(new FileReader(sourceFileName))) {
                String line;

                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(",");
                    if (parts.length == 4) {
                        String name = parts[0];
                        double principal = Double.parseDouble(parts[1]);
                        double rate = Double.parseDouble(parts[2]);
                        double time = Double.parseDouble(parts[3]);

                        // Calculate simple interest
                        double interest = (principal * rate * time) / 100.0;

                        // Write original record and interest to the destination file
                        String outputLine = String.format("%s, %.2f, %.2f, %.2f, %.2f", name, principal, rate, time, interest);
                        writer.write(outputLine);
                        writer.newLine();
                    }
                }
            }

            System.out.println("Simple interest calculations and writing to the destination file are complete.");

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    private static void createInputFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write("John, 1000.00, 5.0, 2.5");
            writer.newLine();
            writer.write("Alice, 1500.00, 4.5, 3.0");
            writer.newLine();
            writer.write("Bob, 800.00, 6.0, 1.5");
            System.out.println("Input file created: " + filename);
        } catch (IOException e) {
            System.err.println("Error creating the input file: " + e.getMessage());
        }
    }
}
