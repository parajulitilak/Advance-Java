package unit_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MultiplyTwoNumbersGUI extends JFrame {

    private JTextField textField1, textField2, resultField;

    public MultiplyTwoNumbersGUI() {
        // Set up the frame
        setTitle("Multiply Two Numbers");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create components
        textField1 = new JTextField(10);
        textField2 = new JTextField(10);
        resultField = new JTextField(10);
        resultField.setEditable(false); // Make result field read-only

        JLabel label1 = new JLabel("Number 1:");
        JLabel label2 = new JLabel("Number 2:");
        JLabel resultLabel = new JLabel("Result:");

        JButton multiplyButton = new JButton("Multiply");
        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                multiplyNumbers();
            }
        	});

        // Set layout
        setLayout(new GridLayout(4, 2));

        // Add components to the frame
        add(label1);
        add(textField1);
        add(label2);
        add(textField2);
        add(resultLabel);
        add(resultField);
        add(new JLabel()); // Empty label for spacing
        add(multiplyButton);

        // Make the frame visible
        setVisible(true);
    }

    private void multiplyNumbers() {
        try {
            // Get the numbers from text fields
            double num1 = Double.parseDouble(textField1.getText());
            double num2 = Double.parseDouble(textField2.getText());

            // Perform the multiplication
            double result = num1 * num2;

            // Display the result
            resultField.setText(String.valueOf(result));
        } catch (NumberFormatException ex) {
            // Handle the case where the user enters non-numeric input
            JOptionPane.showMessageDialog(this, "Please enter valid numeric values.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MultiplyTwoNumbersGUI();
            }
        });
    }
}

