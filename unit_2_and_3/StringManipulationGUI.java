package unit_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StringManipulationGUI extends JFrame {

    private JTextField inputField;
    private JLabel outputLabel;

    public StringManipulationGUI() {
        setTitle("String Manipulation");
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        inputField = new JTextField(20);
        outputLabel = new JLabel("Input any string");

        JButton palindromeButton = new JButton("Check Palindrome");
        JButton reverseButton = new JButton("Reverse");
        JButton vowelsButton = new JButton("Find Vowels");

        palindromeButton.addActionListener(e -> checkPalindrome());
        reverseButton.addActionListener(e -> reverseString());
        vowelsButton.addActionListener(e -> findVowels());

        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Input: "));
        inputPanel.add(inputField);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(palindromeButton);
        buttonPanel.add(reverseButton);
        buttonPanel.add(vowelsButton);

        add(inputPanel, BorderLayout.NORTH);
        add(outputLabel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void checkPalindrome() {
        String input = inputField.getText().toLowerCase();
        String reversed = new StringBuilder(input).reverse().toString();

        if (input.equals(reversed)) {
            outputLabel.setText("The input is a palindrome.");
        } else {
            outputLabel.setText("The input is not a palindrome.");
        }
    }

    private void reverseString() {
        String input = inputField.getText();
        String reversed = new StringBuilder(input).reverse().toString();
        outputLabel.setText("Reversed String: " + reversed);
    }

    private void findVowels() {
        String input = inputField.getText().toLowerCase();
        StringBuilder vowels = new StringBuilder();

        for (char c : input.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                vowels.append(c).append(" ");
            }
        }

        if (vowels.length() > 0) {
            outputLabel.setText("Vowels: " + vowels.toString().trim());
        } else {
            outputLabel.setText("No vowels found in the input.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(StringManipulationGUI::new);
    }
}

