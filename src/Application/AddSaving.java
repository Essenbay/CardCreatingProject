package Application;

import Components.CreditAccount;
import Database.DBManager;
import com.company.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddSaving extends Container {
    private JLabel idLabel;
    private JLabel firstnameLabel;
    private JLabel lastnameLabel;
    private JLabel balanceLabel;
    private JLabel creationDateLabel;
    private JLabel phoneNumberLabel;
    private JLabel addressLabel;
    private JLabel interestRateLabel;
    private JLabel storageDateLabel;

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
    private JTextField storageDayText;
    private JTextField storageMonthText;
    private JTextField storageYearText;

    private JButton addButton;
    private JButton backButton;

    public AddSaving() {
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

        this.storageDateLabel = new JLabel("Storage Date (y, m, d): ");
        this.storageDateLabel.setBounds(90, 340, 100, 30);
        this.add(this.storageDateLabel);
        this.storageDayText = new JTextField();
        this.storageDayText.setBounds(230, 340, 40, 30);
        this.add(this.storageDayText);
        this.storageMonthText = new JTextField();
        this.storageMonthText.setBounds(280, 340, 40, 30);
        this.add(this.storageMonthText);
        this.storageYearText = new JTextField();
        this.storageYearText.setBounds(330, 340, 40, 30);
        this.add(this.storageYearText);


        this.addButton = new JButton("ADD Credit Account ");
        this.addButton.setBounds(90, 420, 290, 30);
        this.addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                DBManager.addCredit(new CreditAccount(Long.parseLong(AddSaving.this.idText.getText()), Integer.parseInt(AddSaving.this.balanceText.getText()),
                        Integer.parseInt(AddSaving.this.creationYearText.getText()),Integer.parseInt(AddSaving.this.creationMonthText.getText()),Integer.parseInt(AddSaving.this.creationDayText.getText()),
                        AddSaving.this.firstnameText.getText(), AddSaving.this.lastnameText.getText(),
                        AddSaving.this.addressText.getText(), AddSaving.this.phoneNumberText.getText(),
                        Integer.parseInt(AddSaving.this.interestRateText.getText()),
                        Integer.parseInt(AddSaving.this.storageYearText.getText()),Integer.parseInt(AddSaving.this.storageMonthText.getText()),Integer.parseInt(AddSaving.this.storageDayText.getText())));
                AddSaving.this.idText.setText("");
                AddSaving.this.balanceText.setText("");
                AddSaving.this.firstnameText.setText("");
                AddSaving.this.lastnameText.setText("");
                AddSaving.this.creationYearText.setText("");
                AddSaving.this.creationMonthText.setText("");
                AddSaving.this.creationDayText.setText("");
                AddSaving.this.addressText.setText("");
                AddSaving.this.phoneNumberText.setText("");
                AddSaving.this.interestRateText.setText("");
                AddSaving.this.storageYearText.setText("");
                AddSaving.this.storageMonthText.setText("");
                AddSaving.this.storageDayText.setText("");
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
                MainFrame.savingWindow.setVisible(false);
            }
        });
        this.add(this.backButton);
    }
}
