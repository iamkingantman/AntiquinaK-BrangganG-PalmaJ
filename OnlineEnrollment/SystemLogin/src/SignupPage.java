import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.HashMap;

public class SignupPage implements ActionListener {

    JFrame frame = new JFrame("Sign Up Page");
    JButton confirmRegistrationButton = new JButton("Confirm Registration");
    JButton signInButton = new JButton("Already have an account? Sign In");
    JTextField userIDField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    JTextField studentIDField = new JTextField();
    JLabel userIDLabel = new JLabel("User ID:");
    JLabel userPasswordLabel = new JLabel("Password:");
    JLabel studentIDLabel = new JLabel("Student ID:");
    JLabel messageLabel = new JLabel();

    HashMap<String, String> logininfo;

    SignupPage(HashMap<String, String> loginInfoOriginal) {
        logininfo = loginInfoOriginal;

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 450);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout());

        
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        panel.setBackground(new Color(135, 206, 235));

        frame.setContentPane(panel);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(15, 15, 15, 15);

        
        userIDLabel.setFont(new Font("Segoe UI", Font.BOLD, 14));
        userIDLabel.setForeground(new Color(255, 255, 255)); 
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(userIDLabel, gbc);

        userIDField.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        userIDField.setPreferredSize(new Dimension(200, 30));
        userIDField.setBackground(new Color(254, 254, 254));
        userIDField.setForeground(Color.BLACK);
        userIDField.setBorder(BorderFactory.createLineBorder(new Color(95, 158, 160), 2));
        userIDField.setCaretColor(Color.BLACK);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(userIDField, gbc);

       
        userPasswordLabel.setFont(new Font("Segoe UI", Font.BOLD, 14));
        userPasswordLabel.setForeground(new Color(255, 255, 255));
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(userPasswordLabel, gbc);

        userPasswordField.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        userPasswordField.setPreferredSize(new Dimension(200, 30));
        userPasswordField.setBackground(new Color(254, 254, 254));
        userPasswordField.setForeground(Color.BLACK);
        userPasswordField.setBorder(BorderFactory.createLineBorder(new Color(95, 158, 160), 2));
        userPasswordField.setCaretColor(Color.BLACK);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(userPasswordField, gbc);

       
        studentIDLabel.setFont(new Font("Segoe UI", Font.BOLD, 14));
        studentIDLabel.setForeground(new Color(255, 255, 255)); 
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(studentIDLabel, gbc);

        studentIDField.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        studentIDField.setPreferredSize(new Dimension(200, 30));
        studentIDField.setBackground(new Color(254, 254, 254));
        studentIDField.setForeground(Color.BLACK);
        studentIDField.setBorder(BorderFactory.createLineBorder(new Color(95, 158, 160), 2));
        studentIDField.setCaretColor(Color.BLACK);
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(studentIDField, gbc);

        
        messageLabel.setFont(new Font("Segoe UI", Font.ITALIC, 16));
        messageLabel.setForeground(new Color(255, 99, 71)); 
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(messageLabel, gbc);

        
        confirmRegistrationButton.setFont(new Font("Segoe UI", Font.BOLD, 14));
        confirmRegistrationButton.setForeground(Color.WHITE);
        confirmRegistrationButton.setBackground(new Color(0, 122, 204));
        confirmRegistrationButton.setPreferredSize(new Dimension(200, 35));
        confirmRegistrationButton.setFocusPainted(false);
        confirmRegistrationButton.setBorder(BorderFactory.createEmptyBorder());
        confirmRegistrationButton.addActionListener(this);
        confirmRegistrationButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        confirmRegistrationButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                confirmRegistrationButton.setBackground(new Color(0, 102, 204));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                confirmRegistrationButton.setBackground(new Color(0, 122, 204));
            }
        });
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(confirmRegistrationButton, gbc);

        
        signInButton.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        signInButton.setForeground(Color.WHITE);
        signInButton.setBackground(new Color(0, 122, 204));
        signInButton.setPreferredSize(new Dimension(200, 30));
        signInButton.setFocusPainted(false);
        signInButton.setBorder(BorderFactory.createEmptyBorder());
        signInButton.addActionListener(this);
        signInButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        signInButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signInButton.setBackground(new Color(0, 102, 204));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signInButton.setBackground(new Color(0, 122, 204));
            }
        });
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(signInButton, gbc);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == confirmRegistrationButton) {
            String userID = userIDField.getText();
            String password = new String(userPasswordField.getPassword());
            String studentID = studentIDField.getText();

            if (logininfo.containsKey(userID)) {
                messageLabel.setForeground(new Color(255, 99, 71)); 
                messageLabel.setText("Username already exists. Please choose a different one.");
                userIDField.requestFocus();
            } else if (!studentID.matches("\\d+")) { 
                studentIDField.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                messageLabel.setForeground(new Color(255, 99, 71));
                messageLabel.setText("Please enter a valid Student ID (numbers only).");
                studentIDField.requestFocus();
            } else {
                logininfo.put(userID, password);
                messageLabel.setForeground(new Color(144, 238, 144)); 
                messageLabel.setText("Successful account registration. You can now log in.");
                frame.dispose(); 
                new LoginPage(logininfo); 
            }
        }

        if (e.getSource() == signInButton) {
            frame.dispose(); 
            new LoginPage(logininfo); 
        }
    }
}
