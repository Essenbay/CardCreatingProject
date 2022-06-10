package Application;

import Components.CreditAccount;
import Database.DBManager;
import com.company.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddCredit extends Container {
    private JLabel idLabel;
    private JLabel firstnameLabel;
    private JLabel lastnameLabel;
    private JLabel balanceLabel;
    private JLabel creationDateLabel;
    private JLabel phoneNumberLabel;
    private JLabel addressLabel;
    private JLabel interestRateLabel;
    private JLabel maturityDateLabel;

    private JTextField idText;
    private JTextField balanceText;
    private JTextField firstnameText;
    private JTextField lastnameText;
    private JTextField addressText;
    private JTextField phoneNumberText;
    private JTextField creationDayText;
    private JTextField creationMonthText;
    private JTextField creationYearText;
    private JTextField interestRateText;
    private JTextField maturityDayText;
    private JTextField maturityMonthText;
    private JTextField maturityYearText;

    private JButton addButton;
    private JButton backButton;

    public AddCredit() {
        this.setSize(500, 600);
        this.setLayout((LayoutManager)null);

        this.idLabel = new JLabel("ID: ");
        this.idLabel.setBounds(100, 20, 50, 30);
        this.add(this.idLabel);
        this.idText = new JTextField();
        this.idText.setBounds(150, 20, 50, 30);
        this.add(this.idText);

        this.balanceLabel = new JLabel("Balance: ");
        this.balanceLabel.setBounds(90, 60, 100, 30);
        this.add(this.balanceLabel);
        this.balanceText = new JTextField();
        this.balanceText.setBounds(230, 60, 150, 30);
        this.add(this.balanceText);

        this.creationDateLabel = new JLabel("Date (y, m, d): ");
        this.creationDateLabel.setBounds(90, 100, 100, 30);
        this.add(this.creationDateLabel);
        this.creationDayText = new JTextField();
        this.creationDayText.setBounds(230, 100, 40, 30);
        this.add(this.creationDayText);
        this.creationMonthText = new JTextField();
        this.creationMonthText.setBounds(280, 100, 40, 30);
        this.add(this.creationMonthText);
        this.creationYearText = new JTextField();
        this.creationYearText.setBounds(330, 100, 40, 30);
        this.add(this.creationYearText);

        this.firstnameLabel = new JLabel("Firstname: ");
        this.firstnameLabel.setBounds(90, 140, 100, 30);
        this.add(this.firstnameLabel);
        this.firstnameText = new JTextField();
        this.firstnameText.setBounds(230, 140, 150, 30);
        this.add(this.firstnameText);
        this.lastnameLabel = new JLabel("Lastname: ");
        this.lastnameLabel.setBounds(90, 180, 100, 30);
        this.add(this.lastnameLabel);
        this.lastnameText = new JTextField();
        this.lastnameText.setBounds(230, 180, 150, 30);
        this.add(this.lastnameText);
        this.addressLabel = new JLabel("Address: ");
        this.addressLabel.setBounds(90, 220, 100, 30);
        this.add(this.addressLabel);
        this.addressText = new JTextField();
        this.addressText.setBounds(230, 220, 150, 30);
        this.add(this.addressText);
        this.phoneNumberLabel = new JLabel("Phone Number: ");
        this.phoneNumberLabel.setBounds(90, 260, 100, 30);
        this.add(this.phoneNumberLabel);
        this.phoneNumberText = new JTextField();
        this.phoneNumberText.setBounds(230, 260, 150, 30);
        this.add(this.phoneNumberText);
        this.interestRateLabel = new JLabel("Interest Rate: ");
        this.interestRateLabel.setBounds(90, 300, 100, 30);
        this.add(this.interestRateLabel);
        this.interestRateText = new JTextField();
        this.interestRateText.setBounds(230, 300, 150, 30);
        this.add(this.interestRateText);

        this.maturityDateLabel = new JLabel("Maturity Date (y, m, d): ");
        this.maturityDateLabel.setBounds(90, 340, 100, 30);
        this.add(this.maturityDateLabel);
        this.maturityDayText = new JTextField();
        this.maturityDayText.setBounds(230, 340, 40, 30);
        this.add(this.maturityDayText);
        this.maturityMonthText = new JTextField();
        this.maturityMonthText.setBounds(280, 340, 40, 30);
        this.add(this.maturityMonthText);
        this.maturityYearText = new JTextField();
        this.maturityYearText.setBounds(330, 340, 40, 30);
        this.add(this.maturityYearText);


        this.addButton = new JButton("ADD Credit Account ");
        this.addButton.setBounds(90, 420, 290, 30);
        this.addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                DBManager.addCredit(new CreditAccount(Long.parseLong(AddCredit.this.idText.getText()), Integer.parseInt(AddCredit.this.balanceText.getText()),
                        Integer.parseInt(AddCredit.this.creationYearText.getText()),Integer.parseInt(AddCredit.this.creationMonthText.getText()),Integer.parseInt(AddCredit.this.creationDayText.getText()),
                        AddCredit.this.firstnameText.getText(), AddCredit.this.lastnameText.getText(),
                        AddCredit.this.addressText.getText(), AddCredit.this.phoneNumberText.getText(),
                        Integer.parseInt(AddCredit.this.interestRateText.getText()),
                        Integer.parseInt(AddCredit.this.maturityYearText.getText()),Integer.parseInt(AddCredit.this.maturityMonthText.getText()),Integer.parseInt(AddCredit.this.maturityDayText.getText())));
                AddCredit.this.idText.setText("");
                AddCredit.this.balanceText.setText("");
                AddCredit.this.firstnameText.setText("");
                AddCredit.this.lastnameText.setText("");
                AddCredit.this.creationYearText.setText("");
                AddCredit.this.creationMonthText.setText("");
                AddCredit.this.creationDayText.setText("");
                AddCredit.this.addressText.setText("");
                AddCredit.this.phoneNumberText.setText("");
                AddCredit.this.interestRateText.setText("");
                AddCredit.this.maturityYearText.setText("");
                AddCredit.this.maturityMonthText.setText("");
                AddCredit.this.maturityDayText.setText("");
            }
        });
        this.add(this.addButton);

        this.backButton = new JButton("BACK");
        this.backButton.setBounds(90, 460, 210, 30);
        this.backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MainFrame var10000 = Main.frame;
                MainFrame.addWindow.setVisible(true);
                var10000 = Main.frame;
                MainFrame.creditWindow.setVisible(false);
            }
        });
        this.add(this.backButton);
    }
}

