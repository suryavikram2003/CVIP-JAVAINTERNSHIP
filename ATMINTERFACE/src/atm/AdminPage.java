package atm;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AdminPage extends JFrame implements ActionListener {
    JButton viewAccountsButton, deleteAccountButton, backButton;

    AdminPage() {
        setTitle("Admin Page");

        viewAccountsButton = new JButton("View Accounts");
        viewAccountsButton.setFont(new Font("Arial", Font.BOLD, 14));
        viewAccountsButton.setBounds(150, 100, 200, 30);
        add(viewAccountsButton);
        viewAccountsButton.addActionListener(this);

        deleteAccountButton = new JButton("Delete Account");
        deleteAccountButton.setFont(new Font("Arial", Font.BOLD, 14));
        deleteAccountButton.setBounds(150, 150, 200, 30);
        add(deleteAccountButton);
        deleteAccountButton.addActionListener(this);

        backButton = new JButton("Logout");
        backButton.setFont(new Font("Arial", Font.BOLD, 14));
        backButton.setBounds(150, 200, 200, 30);
        add(backButton);
        backButton.addActionListener(this);

        getContentPane().setBackground(Color.WHITE);

        setSize(500, 300);
        setLocation(550, 200);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == viewAccountsButton) {

            JOptionPane.showMessageDialog(null, "View Accounts functionality to be implemented");
        } else if (ae.getSource() == deleteAccountButton) {
    
            JOptionPane.showMessageDialog(null, "Delete Account functionality to be implemented");
        } else if (ae.getSource() == backButton) {
            setVisible(false);
            new Login().setVisible(true);
        }
    }

    public static void main(String[] args) {
        new AdminPage().setVisible(true);
    }
}
