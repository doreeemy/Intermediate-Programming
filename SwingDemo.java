import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingDemo {
  public static void main(String[] args) {
    
    // Create the main window 
    JFrame frame = new JFrame("Swing Components Demo");
    frame.setSize(400, 200);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new FlowLayout());

    // JLabel
    JLabel nameLabel = new JLabel("Enter Name: ");

    // JTextField
    JTextField nameField = new JTextField(15);

    // JComboBox
    String[] courses = {"Java","Python","C++"};
    JComboBox<String> courseBox = new JComboBox<>(courses);

    // JButton
    JButton submitBtn = new JButton("Submit");

    // Output Label 
    JLabel resultLabel = new JLabel("Result will appear here.");

    // Action for button click
    submitBtn.addActionListener(e -> {
      String name = nameField.getText();
      String course = (String) courseBox.getSelectedItem();
      resultLabel.setText("Hello " + name + "! You selected: " + course);
    });

    // Add all components to frame
    frame.add(nameLabel);
    frame.add(nameField);
    frame.add(courseBox);
    frame.add(submitBtn);
    frame.add(resultLabel);

    // Show the window
    frame.setVisible(true);
  }
}
