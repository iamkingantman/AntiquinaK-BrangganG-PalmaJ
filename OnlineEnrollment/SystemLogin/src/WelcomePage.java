import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WelcomePage {

    private final JFrame frame;
    private final JLabel welcomeLabel;
    private final JLabel firstNameLabel, middleNameLabel, lastNameLabel, genderLabel, addressLabel, contactNumberLabel, parentsNameLabel, emergencyContactLabel, courseLabel;
    private final JTextField firstNameField, middleNameField, lastNameField, addressField, contactNumberField, parentsNameField, emergencyContactField;
    private final JComboBox<String> genderComboBox, courseComboBox;
    private final JButton enrollButton;

    WelcomePage(String userID) {
        frame = new JFrame("Welcome Page");

        welcomeLabel = new JLabel();
        firstNameLabel = new JLabel("First Name: ");
        middleNameLabel = new JLabel("Middle Name: ");
        lastNameLabel = new JLabel("Last Name: ");
        genderLabel = new JLabel("Gender: ");
        addressLabel = new JLabel("Address: ");
        contactNumberLabel = new JLabel("Contact Number: ");
        parentsNameLabel = new JLabel("Parents / Guardian Name: ");
        emergencyContactLabel = new JLabel("Emergency Contact: ");
        courseLabel = new JLabel("Course: ");

        firstNameField = new JTextField();
        middleNameField = new JTextField();
        lastNameField = new JTextField();
        addressField = new JTextField();
        contactNumberField = new JTextField();
        parentsNameField = new JTextField();
        emergencyContactField = new JTextField();

        genderComboBox = new JComboBox<>(new String[] { "Select Gender", "Male", "Female", "Other" });
        courseComboBox = new JComboBox<>(new String[] { "Select Course", "Information Technology", "Computer Science", "Electrical Engineering", "Mechanical Engineering", "Civil Engineering", "Business Administration" });

        enrollButton = new JButton("Enroll");

        
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBackground(new Color(135, 206, 235));  
        
        welcomeLabel.setText("Welcome " + userID);
        welcomeLabel.setFont(new Font("Segoe UI", Font.BOLD, 18));
        welcomeLabel.setForeground(Color.WHITE); 
        welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        
        panel.add(welcomeLabel, BorderLayout.NORTH);

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(10, 2, 10, 10));
        formPanel.setBackground(new Color(0, 0, 0, 100));

        addFormField(formPanel, firstNameLabel, firstNameField);
        addFormField(formPanel, middleNameLabel, middleNameField);
        addFormField(formPanel, lastNameLabel, lastNameField);
        addFormField(formPanel, genderLabel, genderComboBox);
        addFormField(formPanel, addressLabel, addressField);
        addFormField(formPanel, contactNumberLabel, contactNumberField);
        addFormField(formPanel, parentsNameLabel, parentsNameField);
        addFormField(formPanel, emergencyContactLabel, emergencyContactField);
        addFormField(formPanel, courseLabel, courseComboBox);

        panel.add(formPanel, BorderLayout.CENTER);

        enrollButton.setFont(new Font("Segoe UI", Font.BOLD, 16));
        enrollButton.setForeground(Color.WHITE);
        enrollButton.setBackground(new Color(34, 139, 34));  
        enrollButton.setFocusPainted(false);
        enrollButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        enrollButton.addActionListener((ActionEvent e) -> {
            if (validateForm()) {
                JOptionPane.showMessageDialog(frame, "Congratulations! You are successfully enrolled.", "Enrollment Success", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0); 
            } else {
                JOptionPane.showMessageDialog(frame, "Please fill out all required fields before enrolling.", "Form Incomplete", JOptionPane.ERROR_MESSAGE);
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.BLACK);
        buttonPanel.add(enrollButton);
        panel.add(buttonPanel, BorderLayout.SOUTH);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 550); 
        frame.setLocationRelativeTo(null);
        frame.setContentPane(panel);
        frame.setVisible(true);
    }

    private void addFormField(JPanel formPanel, JLabel label, JComponent field) {
        label.setFont(new Font("Segoe UI", Font.PLAIN, 12)); 
        label.setForeground(Color.WHITE);
        formPanel.add(label);

        if (field instanceof JTextField) {
            JTextField textField = (JTextField) field;
            textField.setFont(new Font("Segoe UI", Font.PLAIN, 17)); 
            textField.setBackground(Color.WHITE);
            textField.setPreferredSize(new Dimension(150, 30)); 
            textField.addFocusListener(new FocusAdapter() {
                public void focusGained(FocusEvent e) {
                    textField.setBorder(BorderFactory.createLineBorder(Color.GRAY));
                }
            });
            formPanel.add(textField);
        } else if (field instanceof JComboBox) {
            JComboBox<?> comboBox = (JComboBox<?>) field;
            comboBox.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            comboBox.addActionListener(e -> comboBox.setBorder(BorderFactory.createLineBorder(Color.GRAY))); 
            formPanel.add(comboBox);
        }
    }

    private boolean validateForm() {
        boolean isValid = true;

        if (firstNameField.getText().trim().isEmpty()) {
            firstNameField.setBorder(BorderFactory.createLineBorder(Color.RED, 2)); 
            isValid = false;
        } else {
            firstNameField.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        }

        if (middleNameField.getText().trim().isEmpty()) {
            middleNameField.setBorder(BorderFactory.createLineBorder(Color.RED, 2)); 
            isValid = false;
        } else {
            middleNameField.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        }

        if (lastNameField.getText().trim().isEmpty()) {
            lastNameField.setBorder(BorderFactory.createLineBorder(Color.RED, 2)); 
            isValid = false;
        } else {
            lastNameField.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        }

        if (addressField.getText().trim().isEmpty()) {
            addressField.setBorder(BorderFactory.createLineBorder(Color.RED, 2)); 
            isValid = false;
        } else {
            addressField.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        }

        if (contactNumberField.getText().trim().isEmpty()) {
            contactNumberField.setBorder(BorderFactory.createLineBorder(Color.RED, 2)); 
            isValid = false;
        } else {
            contactNumberField.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        }

        if (parentsNameField.getText().trim().isEmpty()) {
            parentsNameField.setBorder(BorderFactory.createLineBorder(Color.RED, 2)); 
            isValid = false;
        } else {
            parentsNameField.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        }

        if (emergencyContactField.getText().trim().isEmpty()) {
            emergencyContactField.setBorder(BorderFactory.createLineBorder(Color.RED, 2)); 
            isValid = false;
        } else {
            emergencyContactField.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        }

        if (genderComboBox.getSelectedIndex() == 0) {
            genderComboBox.setBorder(BorderFactory.createLineBorder(Color.RED, 2)); 
            isValid = false;
        } else {
            genderComboBox.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        }

        if (courseComboBox.getSelectedIndex() == 0) {
            courseComboBox.setBorder(BorderFactory.createLineBorder(Color.RED, 2)); 
            isValid = false;
        } else {
            courseComboBox.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        }

        return isValid;
    }

    public static void main(String[] args) {
        new WelcomePage("User123");
    }
}
