/* 18. Write a program to input whole lines from the keyboard and write them to a file. Exit the
 * program when the user types “quit”.
 */

package Unit1ProgrammingwithJava;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class KeyboardInputToFileUntilQuit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            fileWriter = new FileWriter("output.txt");
            bufferedWriter = new BufferedWriter(fileWriter);

            System.out.println("Enter lines of text (type 'quit' to exit):");

            String inputLine;
            while (true) {
                inputLine = scanner.nextLine();
                if (inputLine.equalsIgnoreCase("quit")) {
                    break; // Exit the loop if "quit" is entered
                }
                bufferedWriter.write(inputLine);
                bufferedWriter.newLine();
            }

            System.out.println("Lines written to 'output.txt'.");
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
        } finally {
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
                if (fileWriter != null) {
                    fileWriter.close();
                }
                scanner.close();
            } catch (IOException e) {
                System.err.println("Error closing resources: " + e.getMessage());
            }
        }
    }
}
