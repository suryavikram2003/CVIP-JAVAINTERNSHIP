package atm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {
    private String accountNumber, pin;
    private JTextField textField;
    private JButton depositButton, backButton;

    Deposit(String accountNumber, String pin) {
        this.accountNumber = accountNumber;
        this.pin = pin;

        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource(""));
        Image image = icon.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon scaledIcon = new ImageIcon(image);
        JLabel backgroundLabel = new JLabel(scaledIcon);
        backgroundLabel.setBounds(0, 0, 1550, 830);
        add(backgroundLabel);

        JLabel accountLabel = new JLabel("ACCOUNT NUMBER");
        accountLabel.setForeground(Color.BLACK);
        accountLabel.setFont(new Font("System", Font.BOLD, 16));
        accountLabel.setBounds(200, 190, 250, 35);
        backgroundLabel.add(accountLabel);

        JTextField accountTextField = new JTextField();
        accountTextField.setBackground(new Color(65, 125, 128));
        accountTextField.setForeground(Color.BLACK);
        accountTextField.setBounds(460, 190, 320, 25);
        accountTextField.setFont(new Font("Raleway", Font.BOLD, 22));
        backgroundLabel.add(accountTextField);

        JLabel amountLabel = new JLabel("AMOUNT TO DEPOSIT");
        amountLabel.setForeground(Color.BLACK);
        amountLabel.setFont(new Font("System", Font.BOLD, 16));
        amountLabel.setBounds(200, 230, 250, 35);
        backgroundLabel.add(amountLabel);

        textField = new JTextField();
        textField.setBackground(new Color(65, 125, 128));
        textField.setForeground(Color.BLACK);
        textField.setBounds(460, 230, 320, 25);
        textField.setFont(new Font("Raleway", Font.BOLD, 22));
        backgroundLabel.add(textField);

        depositButton = new JButton("DEPOSIT");
        depositButton.setBounds(700, 362, 150, 35);
        depositButton.setBackground(new Color(65, 125, 128));
        depositButton.setForeground(Color.BLACK);
        depositButton.addActionListener(this);
        backgroundLabel.add(depositButton);

        backButton = new JButton("BACK");
        backButton.setBounds(700, 406, 150, 35);
        backButton.setBackground(new Color(65, 125, 128));
        backButton.setForeground(Color.BLACK);
        backButton.addActionListener(this);
        backgroundLabel.add(backButton);

        setLayout(null);
        setSize(1550, 1080);
        setLocation(0, 0);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            String amount = textField.getText();
            String accountNumber = textField.getText();
            Date date = new Date();
            if (e.getSource() == depositButton) {
                if (textField.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter the Amount you want to Deposit");
                } else {
                    // Replace this with your database insertion logic
                    // Connn c = new Connn();
                    // c.statement.executeUpdate("insert into bank values('" + accountNumber + "','" + pin + "', '" + date + "','Deposit', '" + amount + "')");
                    JOptionPane.showMessageDialog(textField, "AccountNumber:" + accountNumber + " Rs. " + amount + " Deposited Successfully", accountNumber, getDefaultCloseOperation());
                    setVisible(false);
                    new main_Class(accountNumber, pin);
                }
            } else if (e.getSource() == backButton) {
                setVisible(false);
                new main_Class(accountNumber, pin);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Deposit("149451", "");
    }
}
