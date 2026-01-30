import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Registration {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Registration Form");
        frame.setBounds(300, 90, 900, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel nameLabel = new JLabel("Name");
        nameLabel.setBounds(100, 100, 100, 20);
        frame.add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(200, 100, 190, 20);
        frame.add(nameField);

        JLabel mobileLabel = new JLabel("Number");
        mobileLabel.setBounds(100, 150, 100, 20);
        frame.add(mobileLabel);

        JTextField mobileField = new JTextField();
        mobileField.setBounds(200, 150, 150, 20);
        frame.add(mobileField);

        JLabel genderLabel = new JLabel("Gender");
        genderLabel.setBounds(100, 200, 100, 20);
        frame.add(genderLabel);

        JRadioButton r1 = new JRadioButton("Male");
        r1.setBounds(200, 200, 75, 20);
        JRadioButton r2 = new JRadioButton("Female");
        r2.setBounds(275, 200, 80, 20);

        ButtonGroup group = new ButtonGroup();
        group.add(r1);
        group.add(r2);
        frame.add(r1);
        frame.add(r2);

        JLabel dobLabel = new JLabel("DOB");
        dobLabel.setBounds(100, 250, 100, 20);
        frame.add(dobLabel);

        String[] days = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        String[] years = {
            "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989",
            "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999",
            "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009",
            "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019",
            "2020", "2021", "2022", "2023", "2024", "2025"
        };

        JComboBox<String> dayBox = new JComboBox<>(days);
        dayBox.setBounds(200, 250, 50, 20);
        frame.add(dayBox);

        JComboBox<String> monthBox = new JComboBox<>(months);
        monthBox.setBounds(260, 250, 60, 20);
        frame.add(monthBox);

        JComboBox<String> yearBox = new JComboBox<>(years);
        yearBox.setBounds(330, 250, 60, 20);
        frame.add(yearBox);

        JLabel addressLabel = new JLabel("Address");
        addressLabel.setBounds(100, 300, 100, 20);
        frame.add(addressLabel);

        JTextArea addressArea = new JTextArea();
        addressArea.setBounds(200, 300, 200, 75);
        addressArea.setLineWrap(true);
        frame.add(addressArea);

        JCheckBox termsBox = new JCheckBox("Accept Terms And Conditions.");
        termsBox.setBounds(150, 400, 250, 20);
        frame.add(termsBox);

        JButton submitBtn = new JButton("Submit");
        submitBtn.setBounds(150, 450, 100, 20);
        frame.add(submitBtn);

        JButton resetBtn = new JButton("Reset");
        resetBtn.setBounds(270, 450, 100, 20);
        frame.add(resetBtn);

        JTextArea screen = new JTextArea();
        screen.setBounds(450, 100, 300, 370);
        frame.add(screen);

        submitBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (termsBox.isSelected()) {
                    String name = nameField.getText();
                    String mobile = mobileField.getText();
                    String gender = "Male";
                    if (r2.isSelected()) {
                        gender = "Female";
                    }
                    String dob = dayBox.getSelectedItem() + " " + monthBox.getSelectedItem() + " " + yearBox.getSelectedItem();
                    String address = addressArea.getText();

                    screen.setText("Name: " + name + "\n" +
                                   "Mobile: " + mobile + "\n" +
                                   "Gender: " + gender + "\n" +
                                   "DOB: " + dob + "\n" +
                                   "Address: " + address);
                } else {
                    screen.setText("Please accept the Terms and Conditions to submit.");
                }
            }
        });

        resetBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String def = "";
                nameField.setText(def);
                mobileField.setText(def);
                addressArea.setText(def);
                screen.setText(def);
                termsBox.setSelected(false);
                dayBox.setSelectedIndex(0);
                monthBox.setSelectedIndex(0);
                yearBox.setSelectedIndex(0);
                r1.setSelected(true);
            }
        });

        frame.setVisible(true);
    }
}
