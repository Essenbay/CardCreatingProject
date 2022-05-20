package Application;

import Components.DebitAccount;
import Database.DBManager;
import com.company.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddDebit extends Container {
    private JLabel idLabel;
    private JLabel firstnameLabel;
    private JLabel lastnameLabel;
    private JLabel balanceLabel;
    private JLabel dayLabel;
    private JLabel monthLabel;
    private JLabel yearLabel;
    private JLabel annualMaintenanceLabel;
    private JLabel phoneNumberLabel;
    private JLabel addressLabel;

    private JTextField idText;
    private JTextField balanceText;
    private JTextField firstnameText;
    private JTextField lastnameText;
    private JTextField addressText;
    private JTextField phoneNumberText;
    private JTextField dayText;
    private JTextField monthText;
    private JTextField yearText;
    private JTextField annualMaintenanceText;

    private JButton addButton;
    private JButton backButton;

    public AddDebit() {
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
        this.dayLabel = new JLabel("Day: ");
        this.dayLabel.setBounds(90, 100, 100, 30);
        this.add(this.dayLabel);
        this.dayText = new JTextField();
        this.dayText.setBounds(230, 100, 150, 30);
        this.add(this.dayText);
        this.monthLabel = new JLabel("Month: ");
        this.monthLabel.setBounds(90, 140, 100, 30);
        this.add(this.monthLabel);
        this.monthText = new JTextField();
        this.monthText.setBounds(230, 140, 150, 30);
        this.add(this.monthText);
        this.yearLabel = new JLabel("Year: ");
        this.yearLabel.setBounds(90, 180, 100, 30);
        this.add(this.yearLabel);
        this.yearText = new JTextField();
        this.yearText.setBounds(230, 180, 150, 30);
        this.add(this.yearText);
        this.firstnameLabel = new JLabel("Firstname: ");
        this.firstnameLabel.setBounds(90, 220, 100, 30);
        this.add(this.firstnameLabel);
        this.firstnameText = new JTextField();
        this.firstnameText.setBounds(230, 220, 150, 30);
        this.add(this.firstnameText);
        this.lastnameLabel = new JLabel("Lastname: ");
        this.lastnameLabel.setBounds(90, 260, 100, 30);
        this.add(this.lastnameLabel);
        this.lastnameText = new JTextField();
        this.lastnameText.setBounds(230, 260, 150, 30);
        this.add(this.lastnameText);
        this.addressLabel = new JLabel("Address: ");
        this.addressLabel.setBounds(90, 300, 100, 30);
        this.add(this.addressLabel);
        this.addressText = new JTextField();
        this.addressText.setBounds(230, 300, 150, 30);
        this.add(this.addressText);
        this.phoneNumberLabel = new JLabel("Phone Number: ");
        this.phoneNumberLabel.setBounds(90, 340, 100, 30);
        this.add(this.phoneNumberLabel);
        this.phoneNumberText = new JTextField();
        this.phoneNumberText.setBounds(230, 340, 150, 30);
        this.add(this.phoneNumberText);
        this.annualMaintenanceLabel = new JLabel("Annual Maintenance: ");
        this.annualMaintenanceLabel.setBounds(90, 380, 130, 30);
        this.add(this.annualMaintenanceLabel);
        this.annualMaintenanceText = new JTextField();
        this.annualMaintenanceText.setBounds(230, 380, 150, 30);
        this.add(this.annualMaintenanceText);


        this.addButton = new JButton("ADD Debit Account ");
        this.addButton.setBounds(90, 420, 290, 30);
        this.addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                DBManager.addDebit(new DebitAccount(Long.parseLong(AddDebit.this.idText.getText()), Integer.parseInt(AddDebit.this.balanceText.getText()),
                        Integer.parseInt(AddDebit.this.yearText.getText()),Integer.parseInt(AddDebit.this.monthText.getText()),Integer.parseInt(AddDebit.this.dayText.getText()),
                        AddDebit.this.firstnameText.getText(), AddDebit.this.lastnameText.getText(),
                        AddDebit.this.addressText.getText(), AddDebit.this.phoneNumberText.getText(),
                        Integer.parseInt(AddDebit.this.annualMaintenanceText.getText())));
                AddDebit.this.idText.setText("");
                AddDebit.this.balanceText.setText("");
                AddDebit.this.firstnameText.setText("");
                AddDebit.this.lastnameText.setText("");
                AddDebit.this.yearText.setText("");
                AddDebit.this.monthText.setText("");
                AddDebit.this.dayText.setText("");
                AddDebit.this.addressText.setText("");
                AddDebit.this.phoneNumberText.setText("");
                AddDebit.this.annualMaintenanceText.setText("");
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
                MainFrame.debitWindow.setVisible(false);
            }
        });
        this.add(this.backButton);
    }
}
