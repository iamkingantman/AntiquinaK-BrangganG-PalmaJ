import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.HashMap;

public class LoginPage implements ActionListener {

    private static LoginPage loginPage;

    private JFrame frame;
    private JButton loginButton;
    private JButton resetButton;
    private JButton signupButton;
    private JTextField userIDField;
    private JPasswordField userPasswordField;
    private JLabel userIDLabel;
    private JLabel userPasswordLabel;
    private JLabel messageLabel;

    private HashMap<String, String> logininfo;
    private SignupPage signupPage;

    public LoginPage(HashMap<String, String> loginInfoOriginal) {
        logininfo = loginInfoOriginal;
        initializeComponents();
        setupLayout();
        frame.setVisible(true);
    }

    private void initializeComponents() {
        frame = new JFrame("Login Page");
        loginButton = new JButton("Login");
        resetButton = new JButton("Reset");
        signupButton = new JButton("Create Account");
        userIDField = new JTextField();
        userPasswordField = new JPasswordField();
        userIDLabel = new JLabel("User ID:");
        userPasswordLabel = new JLabel("Password:");
        messageLabel = new JLabel();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 500);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new GridBagLayout());

        frame.getContentPane().setBackground(new Color(135, 206, 235));
    }

    private void setupLayout() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(15, 15, 15, 15); 
        gbc.anchor = GridBagConstraints.CENTER;

        userIDLabel.setFont(new Font("Segoe UI", Font.BOLD, 14));
        userIDLabel.setForeground(new Color(255, 255, 255));
        gbc.insets = new Insets(10, 20, 10, 0); 
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        frame.add(userIDLabel, gbc);

        userIDField.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        userIDField.setPreferredSize(new Dimension(200, 35));
        userIDField.setBackground(new Color(254, 254, 254));
        userIDField.setForeground(Color.BLACK);
        userIDField.setBorder(BorderFactory.createLineBorder(new Color(95, 158, 160), 2));
        userIDField.setCaretColor(Color.BLACK);
        gbc.insets = new Insets(10, 0, 10, 100); 
        gbc.gridx = 1;
        frame.add(userIDField, gbc);

        userPasswordLabel.setFont(new Font("Segoe UI", Font.BOLD, 14));
        userPasswordLabel.setForeground(new Color(255, 255, 255));
        gbc.insets = new Insets(10, 20, 10, 0); 
        gbc.gridx = 0;
        gbc.gridy = 2;
        frame.add(userPasswordLabel, gbc);

        userPasswordField.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        userPasswordField.setPreferredSize(new Dimension(200, 35));
        userPasswordField.setBackground(new Color(254, 254, 254));
        userPasswordField.setForeground(Color.BLACK);
        userPasswordField.setBorder(BorderFactory.createLineBorder(new Color(95, 158, 160), 2));
        userPasswordField.setCaretColor(Color.BLACK);
        gbc.insets = new Insets(10, 0, 10, 100); 
        gbc.gridx = 1;
        frame.add(userPasswordField, gbc);

        messageLabel.setFont(new Font("Segoe UI", Font.ITALIC, 16));
        messageLabel.setForeground(new Color(255, 99, 71));
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        frame.add(messageLabel, gbc);

        loginButton.setFont(new Font("Segoe UI", Font.BOLD, 14));
        loginButton.setForeground(Color.WHITE);
        loginButton.setBackground(new Color(0, 122, 204));
        loginButton.setPreferredSize(new Dimension(150, 40));
        loginButton.setFocusPainted(false);
        loginButton.setBorder(BorderFactory.createEmptyBorder());
        loginButton.addActionListener(this);
        loginButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginButton.setBackground(new Color(0, 102, 204));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginButton.setBackground(new Color(0, 122, 204));
            }
        });
        gbc.insets = new Insets(10, 80, 10, 0); 
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        frame.add(loginButton, gbc);

        resetButton.setFont(new Font("Segoe UI", Font.BOLD, 14));
        resetButton.setForeground(Color.WHITE);
        resetButton.setBackground(new Color(255, 87, 34));
        resetButton.setPreferredSize(new Dimension(150, 40));
        resetButton.setFocusPainted(false);
        resetButton.setBorder(BorderFactory.createEmptyBorder());
        resetButton.addActionListener(this);
        resetButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        resetButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                resetButton.setBackground(new Color(255, 140, 0));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                resetButton.setBackground(new Color(255, 87, 34));
            }
        });
        gbc.insets = new Insets(10, 80, 10, 90); 
        gbc.gridx = 1;
        frame.add(resetButton, gbc);

        signupButton.setFont(new Font("Segoe UI", Font.BOLD, 12));
        signupButton.setForeground(Color.WHITE);
        signupButton.setBackground(new Color(0, 122, 204));
        signupButton.setPreferredSize(new Dimension(150, 35));
        signupButton.setFocusPainted(false);
        signupButton.setBorder(BorderFactory.createEmptyBorder());
        signupButton.addActionListener(this);
        signupButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        signupButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signupButton.setBackground(new Color(0, 102, 204));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signupButton.setBackground(new Color(0, 122, 204));
            }
        });
        gbc.insets = new Insets(10, 40, 10, 60); 
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER; 
        frame.add(signupButton, gbc);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == resetButton) {
            userIDField.setText("");
            userPasswordField.setText("");
            messageLabel.setText("");
            userIDField.requestFocus();
        }

        if (e.getSource() == loginButton) {
            String userID = userIDField.getText();
            String password = new String(userPasswordField.getPassword());

            if (logininfo.containsKey(userID)) {
                if (logininfo.get(userID).equals(password)) {
                    messageLabel.setForeground(new Color(144, 238, 144));
                    messageLabel.setText("Login Successful");
                    frame.dispose();
                    new WelcomePage(userID);
                } else {
                    messageLabel.setForeground(new Color(255, 99, 71));
                    messageLabel.setText("Incorrect Password.");
                    userPasswordField.requestFocus();
                }
            } else {
                messageLabel.setForeground(new Color(255, 99, 71));
                messageLabel.setText("Username Not Found. Please Create Account first.");
                userIDField.requestFocus();
            }
        }

        if (e.getSource() == signupButton) {
            signupPage = new SignupPage(logininfo);
            frame.dispose();
        }
    }

    public static void main(String[] args) {
        HashMap<String, String> loginInfo = new HashMap<>();
        loginInfo.put("user1", "password1");
        loginInfo.put("user2", "password2");
        loginPage = new LoginPage(loginInfo);
    }
}
