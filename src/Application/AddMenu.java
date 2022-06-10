package Application;

import com.company.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddMenu extends Container {
    private JButton addDebitButton;
    private JButton addCreditButton;
    private JButton addSavingButton;
    private JButton exitButton;

    public AddMenu() {
        this.setSize(500, 600);
        this.setLayout((LayoutManager)null);
        this.addDebitButton = new JButton("ADD DEBIT");
        this.addDebitButton.setBounds(100, 80, 300, 30);
        this.addDebitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MainFrame var10000 = Main.frame;
                MainFrame.addWindow.setVisible(false);
                var10000 = Main.frame;
                MainFrame.debitWindow.setVisible(true);
            }
        });
        this.add(this.addDebitButton);
        this.addCreditButton = new JButton("ADD Credit");
        this.addCreditButton.setBounds(100, 120, 300, 30);
        this.addCreditButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MainFrame var10000 = Main.frame;
                MainFrame.addWindow.setVisible(false);
                var10000 = Main.frame;
                MainFrame.creditWindow.setVisible(true);
            }
        });
        this.add(this.addCreditButton);

        this.addSavingButton = new JButton("ADD SAVING");
        this.addSavingButton.setBounds(100, 160, 300, 30);
        this.addSavingButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MainFrame var10000 = Main.frame;
                MainFrame.addWindow.setVisible(false);
                var10000 = Main.frame;
                MainFrame.savingWindow.setVisible(true);
            }
        });
        this.add(this.addSavingButton);

        this.exitButton = new JButton("EXIT");
        this.exitButton.setBounds(100, 200, 300, 30);
        this.exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MainFrame var10000 = Main.frame;
                MainFrame.menuWindow.setVisible(true);
                var10000 = Main.frame;
                MainFrame.addWindow.setVisible(false);
            }
        });
        this.add(this.exitButton);
    }}
