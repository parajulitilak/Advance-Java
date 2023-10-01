/*
 * 14. Write the simple java program that reads data from one file and writes data to anotherfile.
 *  [2070, 2071, 2073, 2074]
 *  */
package Unit1ProgrammingwithJava;
import java.io.FileWriter;
import java.io.IOException;

public class read_data_from_one_file_write_to_another {
    public static void main(String[] args) {
        String fileName = "myFile.txt"; // Specify the file name

        // Write data to the file
        try (FileWriter writer = new FileWriter(fileName)) {
            String dataToWrite = "Hello, this is some text written to the file.";
            writer.write(dataToWrite);
            System.out.println("Data written to the file successfully.");
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
        }

        // Read data from the file
        try {
            java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.FileReader(fileName));
            String line;
            System.out.println("Data read from the file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.err.println("Error reading from the file: " + e.getMessage());
        }
    }
}
